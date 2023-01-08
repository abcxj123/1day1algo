import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_1100_하얀칸 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char [][] map = new char[8][8];
		int cnt = 0;
		
		for (int i = 0; i < 8; i++) {
			String str = br.readLine();
			for (int j = 0; j < 8; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				char c = map[i][j];
				if(c != 'F') continue;
				
				if(i % 2 == 0) {
					if(j % 2 == 0) {
						cnt++;
					}
				} else {
					if(j % 2 == 1) {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
		
	}

}
