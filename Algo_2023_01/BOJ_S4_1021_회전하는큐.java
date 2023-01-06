import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_S4_1021_회전하는큐 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		LinkedList<Integer> deq = new LinkedList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		
		int [] arr = new int[M];
		
		for (int i = 1; i <= N; i++) {
			deq.add(i);
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < M; i++) {
			int idx = deq.indexOf(arr[i]);
			int half = -1;
			
			if(deq.size() % 2 == 0) {
				half = deq.size() / 2 - 1;
			} else {
				half = deq.size() / 2;
			}
			
			if(idx <= half) {
				for (int j = 0; j < idx; j++) {
					int tmp = deq.pollFirst();
					deq.addLast(tmp);
					ans++;
				}
			} else {
				for (int j = 0; j < deq.size() - idx; j++) {
					int tmp = deq.pollLast();
					deq.addFirst(tmp);
					ans++;
				}
			}
			deq.pollFirst();
		}
		
		System.out.println(ans);

	}

}
