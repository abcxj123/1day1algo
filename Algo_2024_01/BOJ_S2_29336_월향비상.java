import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_S2_29336_월향비상 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			pq.add(Integer.parseInt(st.nextToken()));
		}
		
		int [][] question = new int[M][2];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int T = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			question[i][0] = T;
			question[i][1] = Q;
		}
		
		int lastDay = question[M-1][0];
		long sum = 0;
		
		for (int i = 0; i < M; i++) {
			int t = question[i][0];
			int q = question[i][1];
			
			if(sum >= q) continue;
			
			while(!pq.isEmpty() && sum < q) {
				int n = pq.poll();
				sum += n + t;
			}
			
			if(sum >= q) continue;
			
			System.out.println(-1);
			System.exit(0);
		}
		
		while(!pq.isEmpty()) {
			int n = pq.poll();
			sum += (n + lastDay);
		}
		
		System.out.println(sum);

	}

}
