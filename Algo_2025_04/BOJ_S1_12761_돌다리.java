import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S1_12761_돌다리 {
	static int A, B, M, ans;
	static boolean [] v;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		v = new boolean[100001];
		
		bfs(N);
		
		System.out.println(ans);

	}

	private static void bfs(int N) {
		Queue<Integer> q = new ArrayDeque<>();
		v[N] = true;
		q.add(N);
		
		while(!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int cur = q.poll();
				
				if(cur == M) return;
				
				int back = cur-1;
				int front = cur+1;
				int a1 = cur+A;
				int a2 = cur-A;
				int b1 = cur+B;
				int b2 = cur-B;
				int a3 = cur*A;
				int b3 = cur*B;
				
				if(back >= 0 && !v[back]) {
					q.add(back);
					v[back] = true;
				}
				
				if(front <= 100000 && !v[front]) {
					q.add(front);
					v[front] = true;
				}
				
				if(a1 <= 100000 && !v[a1]) {
					q.add(a1);
					v[a1] = true;
				}
				
				if(a2 >= 0 && !v[a2]) {
					q.add(a2);
					v[a2] = true;
				}
				
				if(b1 <= 100000 && !v[b1]) {
					q.add(b1);
					v[b1] = true;
				}
				
				if(b2 >= 0 && !v[b2]) {
					q.add(b2);
					v[b2] = true;
				}
				
				if(a3 <= 100000 && !v[a3]) {
					q.add(a3);
					v[a3] = true;
				}
				
				if(b3 <= 100000 && !v[b3]) {
					q.add(b3);
					v[b3] = true;
				}
				
			}
			
			ans++;
			
		}
		
	}

}
