import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S2_11724_연결요소 {
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static int N, cnt;
	static boolean [] v;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<Integer>());
		}
		v = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			
			list.get(from).add(to);
			list.get(to).add(from);
		}
		
		for (int i = 1; i <= N; i++) {
			if(!v[i]) bfs(i);
			
		}
		
		System.out.println(cnt);
		
	}

	private static void bfs(int start) {
		cnt++;
		Queue<Integer> q = new LinkedList<Integer>();
		v[start] = true;
		for(int n : list.get(start)) {
			if(!v[n]) q.add(n);
		}
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			if(v[cur]) continue;
			v[cur] = true;
			
			for(int n : list.get(cur)) {
				if(!v[n]) q.add(n);
			}
		}
		
	}

}
