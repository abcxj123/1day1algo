import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_G3_16724_피리부는사나이 {
	// 이번 루프에서 방문했었는데 또 방문하면 세이프존
	// 이번 루프에서 방문 안했는데 또 방문하면 그냥 끝
	// 밖으로 벗어나면 무조건 세이프존
	static int N, M, ans;
	static int [][] map;
	static boolean [][] v;
	static int [] dr = {-1, 0, 1, 0};
	static int [] dc = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		v = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				char c = str.charAt(j);
				if(c == 'U') {
					map[i][j] = 0;
				} else if(c == 'R') {
					map[i][j] = 1;
				} else if(c == 'D') {
					map[i][j] = 2;
				} else {
					map[i][j] = 3;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(v[i][j]) continue;
				
				dfs(i, j, new HashSet<String>());
			}
		}
		
		System.out.println(ans);
		
	}

	private static void dfs(int r, int c, HashSet<String> set) {
		v[r][c] = true;
		int d = map[r][c];
		int nr = r+dr[d];
		int nc = c+dc[d];
		
		if(!check(nr, nc)) {
			ans++;
			return;
		}
		
		String next = nr+" "+nc;
		if(set.contains(next)) {
			ans++;
			return;
		} else if(v[nr][nc]) {
			return;
		}
		
		String now = r+" "+c;
		set.add(now);
		dfs(nr, nc, set);
		
	}

	private static boolean check(int r, int c) {
		return r>=0 && r<N && c>=0 && c<M;
	}

}
