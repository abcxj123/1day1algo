import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_G4_1987_알파벳 {
	static int R, C, max;
	static int [][] map;
	static int [] dr = {-1, 0, 1, 0};
	static int [] dc = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new int[R][C];
		
		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j) - 'A';
			}
		}
		
		int tmp = 1 << map[0][0];
		dfs(0, 0, tmp, 1);
		
		System.out.println(max);
		
	}

	private static void dfs(int r, int c, int v, int cnt) {
		max = Math.max(max, cnt);
		
		for (int d = 0; d < 4; d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			
			if(!check(nr, nc)) continue;
			
			int key = 1 << map[nr][nc];
			if((key & v) == key) continue;
			
			int origin = v;
			v = v | key;
			cnt++;
			dfs(nr, nc, v, cnt);
			cnt--;
			v = origin;
			
		}
		
	}

	private static boolean check(int r, int c) {
		return r>=0 && r<R && c>=0 && c<C;
	}

}
