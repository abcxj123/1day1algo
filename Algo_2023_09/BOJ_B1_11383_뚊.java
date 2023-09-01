import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B1_11383_뚊 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char [][] map = new char[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		boolean flag = true;
		
		exit_for:
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M*2; j+=2) {
				if(str.charAt(j) != map[i][j/2] || str.charAt(j+1) != map[i][j/2]) {
					flag = false;
					break exit_for;
				}
			}
		}
		
		if(flag) {
			System.out.println("Eyfa");
		} else {
			System.out.println("Not Eyfa");
		}
		
		
	}

}
