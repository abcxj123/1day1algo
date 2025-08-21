import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_G5_2589_보물섬 {
	static int N, M, ans;
	static char [][] map;
	static int [] dr = {-1, 0, 1, 0};
	static int [] dc = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char[N][M];
		
		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j] == 'L') bfs(i, j);
			}
		}
		
		System.out.println(ans);
		
	}

	private static void bfs(int sr, int sc) {
		Queue<int []> q = new ArrayDeque<>();
		q.add(new int[] {sr, sc});
		boolean [][] v = new boolean[N][M];
		v[sr][sc] = true;
		
		int move = 0;
		
		while(!q.isEmpty()) {
			int size = q.size();
			
			for (int i = 0; i < size; i++) {
				int [] cur = q.poll();
				int r = cur[0];
				int c = cur[1];
				
				for (int d = 0; d < 4; d++) {
					int nr = r + dr[d];
					int nc = c + dc[d];
					
					if(!check(nr, nc) || v[nr][nc] || map[nr][nc] == 'W') continue;
					
					v[nr][nc] = true;
					q.add(new int[] {nr, nc});
				}
				
			}
			
			ans = Math.max(ans, move++);
		}
		
	}

	private static boolean check(int r, int c) {
		return r>=0 && r<N && c>=0 && c<M;
	}

}
