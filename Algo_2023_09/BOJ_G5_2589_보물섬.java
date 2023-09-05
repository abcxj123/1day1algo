import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_G5_2589_보물섬 {
	static int N, M, ans;
	static int [][] map;
	static int [] dr = {-1, 0, 1, 0};
	static int [] dc = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				char c = str.charAt(j);
				if(c == 'L') {
					map[i][j] = 0;
				} else {
					map[i][j] = 1;
				}
			}
		}
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j] == 0) {
					bfs(i, j);
				}
			}
		}
		
		System.out.println(ans);
		
	}

	private static void bfs(int r, int c) {
		boolean [][] v = new boolean[N][M];
		v[r][c] = true;
		Queue<int []> q = new ArrayDeque<>();
		q.add(new int[] {r, c, 0});
		int max = 0;
		
		while(!q.isEmpty()) {
			int [] cur = q.poll();
			int curR = cur[0];
			int curC = cur[1];
			max = Math.max(max, cur[2]);
			
			for (int d = 0; d < 4; d++) {
				int nr = curR+dr[d];
				int nc = curC+dc[d];
				
				if(!check(nr, nc)) continue;
				
				if(map[nr][nc] == 0 && !v[nr][nc]) {
					v[nr][nc] = true;
					q.add(new int[] {nr, nc, cur[2]+1});
				}
			}
		}
		
		ans = Math.max(max, ans);
		
	}

	private static boolean check(int r, int c) {
		return r>= 0 && r<N && c>=0 && c<M;
	}

}
