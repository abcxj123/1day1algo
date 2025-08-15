import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S2_18232_텔레포트정거장 {
	static int N, E;
	static List<ArrayList<Integer>> list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		list = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<>());
		}
		
		st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		int ans = bfs(S);
		
		System.out.println(ans);
		
	}

	private static int bfs(int s) {
		Queue<Integer> q = new ArrayDeque<>();
		q.add(s);
		boolean [] v = new boolean[N+1];
		v[s] = true;
		
		int turn = 0;
		
		while(!q.isEmpty()) {
			int size = q.size();
			
			for (int i = 0; i < size; i++) {
				int now = q.poll();
				
				if(now == E) {
					return turn;
				}
				
				int front = now+1;
				int back = now-1;
				
				if(front <= N && !v[front]) {
					v[front] = true;
					q.add(front);
				}
				
				if(back >= 1 && !v[back]) {
					v[back] = true;
					q.add(back);
				}
				
				for (int next : list.get(now)) {
					if(v[next]) continue;
					
					v[next] = true;
					q.add(next);
				}
				
			}
			
			turn++;
			
		}
		
		return turn;
	}

}
