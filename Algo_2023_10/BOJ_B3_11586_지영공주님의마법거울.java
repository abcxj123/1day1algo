import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_11586_지영공주님의마법거울 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		char [][] arr = new char[N][N];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		int type = Integer.parseInt(br.readLine());
		
		if(type == 1) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
		} else if(type == 2) {
			for (int i = 0; i < N; i++) {
				for (int j = N-1; j >= 0; j--) {
					sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
		} else {
			for (int i = N-1; i >= 0; i--) {
				for (int j = 0; j < N; j++) {
					sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
		
		
	}

}
