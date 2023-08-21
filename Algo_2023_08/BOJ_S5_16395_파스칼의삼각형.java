import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_16395_파스칼의삼각형 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		long [][] dp = new long[N+1][N+1];
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				if(j == 1 || j == i) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
				}
			}
		}
		
		System.out.println(dp[N][K]);
		
	}

}
