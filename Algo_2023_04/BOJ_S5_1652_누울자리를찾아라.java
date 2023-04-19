import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_1652_누울자리를찾아라 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int row = 0;
		int col = 0;
		int [][] map = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				char c = str.charAt(j);
				if(c == '.') {
					map[i][j] = 0;
				} else if(c == 'X') {
					map[i][j] = 1;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			boolean skip = false;
			for (int j = 0; j < N; j++) {
				if(map[i][j] == 0) {
					if(skip) continue;
					
					cnt++;
					if(cnt >= 2) {
						row++;
						cnt = 0;
						skip = true;
					}
				} else if(map[i][j] == 1) {
					cnt = 0;
					if(skip) skip = false;
				}
			}
		}
		
		for (int j = 0; j < N; j++) {
			int cnt = 0;
			boolean skip = false;
			for (int i = 0; i < N; i++) {
				if(map[i][j] == 0) {
					if(skip) continue;
					
					cnt++;
					if(cnt >= 2) {
						col++;
						cnt = 0;
						skip = true;
					}
				} else if(map[i][j] == 1) {
					cnt = 0;
					if(skip) skip = false;
				}
			}
		}
		
		System.out.println(row+" "+col);
		
	}

}
