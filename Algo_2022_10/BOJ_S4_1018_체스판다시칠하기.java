import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S4_1018_체스판다시칠하기 {
	
	static int N, M;
	static boolean [][] map;
	static int min = 64;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				char c = str.charAt(j);
				if(c == 'W') {
					map[i][j] = true;
				} 
			}
			
		}
		
		int newN = N-7;
		int newM = M-7;
		
		for (int i = 0; i < newN; i++) {
			for (int j = 0; j < newM; j++) {
				check(i, j);
			}
		}
		
		System.out.println(min);
		
	}

	private static void check(int r, int c) {
		int cnt = 0;
		boolean flag = map[r][c];
		
		for (int i = r; i < r+8; i++) {
			for (int j = c; j < c+8; j++) {
				if(map[i][j] != flag) {
					cnt++;
				}
				flag = !flag;
			}
			flag = !flag;
		}
		
		cnt = Math.min(cnt, 64-cnt);
		
		min = Math.min(cnt, min);
		
	}
	
}
