import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_S4_11508_2Plus1세일 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int i = 0; i < N; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		int ans = 0;
		
		while(!pq.isEmpty()) {
			if(pq.size() >= 3) {
				int c1 = pq.poll();
				int c2 = pq.poll();
				int tmp = pq.poll();
				ans += (c1+c2);
			} else {
				while(!pq.isEmpty()) {
					ans += pq.poll();
				}
			}
			
		}
		
		System.out.println(ans);
		
	}

}
