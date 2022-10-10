import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S1_1926_그림 {
	static int n, m;
	static int [][] map;
	static boolean [][] v;
	static int max;
	static int [] dr = {-1, 1, 0, 0};
	static int [] dc = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		v = new boolean[n][m];
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map[i][j] == 1) {
					bfs(i, j);
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		System.out.println(max);

	}

	private static void bfs(int i, int j) {
		Queue<int []> q = new LinkedList<int[]>();
		v[i][j] = true;
		q.add(new int[] {i, j});
		int size = 1;
		
		while(!q.isEmpty()) {
			int [] cur = q.poll();
			int curR = cur[0];
			int curC = cur[1];
			
			for (int d = 0; d < 4; d++) {
				int nr = curR+dr[d];
				int nc = curC+dc[d];
				
				if(!check(nr, nc)) continue;
				
				if(!v[nr][nc] && map[nr][nc] == 1) {
					size++;
					map[nr][nc] = 0;
					v[nr][nc] = true;
					q.add(new int[] {nr, nc});
				}
			}
		}
		
		max = Math.max(max, size);
		
	}

	private static boolean check(int r, int c) {
		return r>=0 && r<n && c>=0 && c<m;
	}

}
