import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_14732_행사장대여Small {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int [][] map = new int[500][500];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for (int j = x1; j < x2; j++) {
				for (int k = y1; k < y2; k++) {
					map[j][k] = 1;
				}
			}
		}
		
		int ans = 0;
		
		for (int i = 0; i < 500; i++) {
			for (int j = 0; j < 500; j++) {
				if(map[i][j] == 1) ans++;
			}
		}
		
		System.out.println(ans);
		
	}

}
