import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_G5_23843_콘센트 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Integer [] times = new Integer[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			times[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(times, Collections.reverseOrder());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			int time = times[i];
			
			if(pq.size() < M) {
				pq.add(time);
				ans = Math.max(ans, time);
				
			} else {
				int next = pq.poll() + time;
				ans = Math.max(ans, next);
				
				pq.add(next);
			}
			
		}
		
		System.out.println(ans);
		
	}

}
