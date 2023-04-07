import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S4_2799_블라인드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char [][] map = new char[5*N+1][5*M+1];
		int [] type = new int[5];
		
		for (int i = 0; i < 5*N+1; i++) {
			String str = br.readLine();
			for (int j = 0; j < 5*M+1; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int sr = 1+5*i;
				int sc = 1+5*j;
				for (int k = 0; k < 5; k++) {
					if(map[sr+k][sc] != '*') {
						type[k]++;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.print(type[i]+" ");
		}
		
	}

}
