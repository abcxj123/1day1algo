import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_1996_지뢰찾기 {
	
	static int N;
	static int [][] map;
	static int [] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int [] dc = {0, 1, 1, 1, 0, -1, -1, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				char c = str.charAt(j);
				
				if(c != '.') {
					map[i][j] = -1;
					add(i, j, c);
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int n = map[i][j];
				if(n == -1) {
					System.out.print("*");
				} else if(n >= 10) {
					System.out.print("M");
				} else {
					System.out.print(n);
				}
			}
			System.out.println();
		}
		
		
	}

	private static void add(int r, int c, char val) {
		int value = val - '0';
		
		for (int d = 0; d < 8; d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			
			if(!check(nr, nc)) continue;
			
			if(map[nr][nc] == -1) continue;
			
			map[nr][nc] += value;
		}
		
	}

	private static boolean check(int r, int c) {
		return r>= 0 && r<N && c>= 0 && c<N;
	}

}
