import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S2_24479_깊이우선탐색1 {
	static int N;
	static List<ArrayList<Integer>> list = new ArrayList<>();
	static int [] ans;
	static boolean [] v;
	static int cnt = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
		}
		
		ans = new int[N+1];
		v = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			list.get(from).add(to);
			list.get(to).add(from);
		}
		
		for (int i = 1; i <= N; i++) {
			Collections.sort(list.get(i));
		}
		
		ans[R] = cnt++;
		v[R] = true;
		dfs(R);
		
		for (int i=1;i<=N;i++) {
			System.out.println(ans[i]);
		}

	}

	private static void dfs(int n) {
		
		for(int p : list.get(n)) {
			if(!v[p]) {
				ans[p] = cnt++;
				v[p] = true;
				dfs(p);
			}
		}
		
		
	}

}

