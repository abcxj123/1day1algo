import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S4_16173_점프왕쩰리Small {
	
	static int N;
	static int [][] map;
	static int [] dr = {0, 1};
	static int [] dc = {1, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		bfs();
	}

	private static void bfs() {
		Queue<int []> q = new LinkedList<>();
		boolean [][] v = new boolean[N][N];
		v[0][0] = true;
		q.add(new int[] {0, 0});
		
		while (!q.isEmpty()) {
			int [] cur = q.poll();
			int curR = cur[0];
			int curC = cur[1];
			int value = map[curR][curC];
			
			if(curR == N-1 && curC == N-1) {
				System.out.println("HaruHaru");
				return;
			}
			
			for (int d = 0; d < 2; d++) {
				int nr = curR+dr[d]*value;
				int nc = curC+dc[d]*value;
				
				if(!check(nr, nc)) continue;
				
				if(!v[nr][nc]) {
					v[nr][nc] = true;
					q.add(new int[] {nr, nc});
				}
				
			}
			
			
		}
		
		System.out.println("Hing");
		
	}

	private static boolean check(int r, int c) {
		return r>=0 && r<N && c>=0 && c<N;
	}

}
