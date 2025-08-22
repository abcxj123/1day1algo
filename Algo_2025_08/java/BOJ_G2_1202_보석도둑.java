import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_G2_1202_보석도둑 {
	static class Jewel implements Comparable<Jewel> {
		int weight;
		int price;
		
		public Jewel(int weight, int price) {
			this.weight = weight;
			this.price = price;
		}

		@Override
		public int compareTo(Jewel o) {
			if(this.weight != o.weight) {
				return Integer.compare(this.weight, o.weight);
			}
			
			return Integer.compare(o.price, this.price);
		}	
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Jewel [] jewels = new Jewel[N];
		int [] bags = new int[K];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			jewels[i] = new Jewel(M, V);
		}
		
		for (int i = 0; i < K; i++) {
			bags[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(jewels);
		Arrays.sort(bags);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		long ans = 0;
		int idx = 0;
		
		for (int i = 0; i < K; i++) {
			while(idx < N) {
				if(bags[i] < jewels[idx].weight) break;
				
				pq.add(jewels[idx++].price);
			}
			
			if(!pq.isEmpty()) ans += pq.poll();
		}
		
		System.out.println(ans);
		
	}

}
