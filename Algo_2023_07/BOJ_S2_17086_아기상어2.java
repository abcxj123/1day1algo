import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S2_17086_아기상어2 {
	static int N, M, max;
	static int [][] map;
	static boolean [][] v;
	static int [] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int [] dc = {0, 1, 1, 1, 0, -1, -1, -1};
	static Queue<int []> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		v = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int n = Integer.parseInt(st.nextToken());
				map[i][j] = n;
				if(n == 1) {
					q.add(new int[] {i, j, 1});
					v[i][j] = true;
				}
			}
		}
		
		bfs();
		
		System.out.println(max);
		
	}

	private static void bfs() {
		while(!q.isEmpty()) {
			int [] cur = q.poll();
			
			for (int d = 0; d < 8; d++) {
				int nr = cur[0] + dr[d];
				int nc = cur[1] + dc[d];
				
				if(!check(nr, nc)) continue;
				
				if(!v[nr][nc] && map[nr][nc] == 0) {
					v[nr][nc] = true;
					map[nr][nc] = cur[2];
					max = Math.max(max, cur[2]);
					q.add(new int[] {nr, nc, cur[2]+1});
				}
				
			}
		}
		
	}

	private static boolean check(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M;
	}

}
