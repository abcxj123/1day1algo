import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_10798_세로읽기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String [] arr = new String[5];
		int C = 0;
		
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();
			arr[i] = str;
			C = Math.max(C, str.length());
		}
		
		char [][] map = new char[5][C];
		
		for (int i = 0; i < 5; i++) {
			String str = arr[i];
			int length = str.length();
			for (int j = 0; j < length; j++) {
				char c = str.charAt(j);
				map[i][j] = c;
			}
		}
		
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < 5; j++) {
				char c = map[j][i];
				if(c == '\u0000') continue;
				sb.append(c);
			}
		}
		
		System.out.println(sb.toString());

	}

}
