import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S2_5567_결혼식 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int [][] arr = new int[N+1][N+1];
		boolean [] check = new boolean[N+1];
		check[1] = true;
		int ans = 0;
		
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		for (int i = 2; i <= N; i++) {
			if(arr[1][i] == 1) {
				check[i] = true;
				for (int j = 2; j <= N; j++) {
					if(arr[i][j] == 1 && !check[j]) {
						check[j] = true;
					}
				}
			}
		}
		
		for (int i = 2; i <= N; i++) {
			if(check[i]) ans++;
		}
		
		
		System.out.println(ans);
		
	}

}
