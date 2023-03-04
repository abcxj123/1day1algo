import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_1531_투명 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int [][] map = new int[100][100];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int sx = Integer.parseInt(st.nextToken())-1;
			int sy = Integer.parseInt(st.nextToken())-1;
			int fx = Integer.parseInt(st.nextToken())-1;
			int fy = Integer.parseInt(st.nextToken())-1;
			
			for (int j = sx; j <= fx; j++) {
				for (int k = sy; k <= fy; k++) {
					map[j][k]++;
				}
			}
		}
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(map[i][j] > M) cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
