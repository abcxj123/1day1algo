import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_G5_12865_평범한배낭 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int [][] arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int [][] dp = new int[N+1][K+1];
		
		if(arr[0][0] <= K) dp[0][arr[0][0]] = arr[0][1];
		
		for (int i = 1; i < N; i++) {
			int w = arr[i][0];
			int v = arr[i][1];
			
			for (int j = 0; j < Math.min(K+1, w); j++) {
				dp[i][j] = dp[i-1][j];
			}
			
			for (int j = w; j <= K; j++) {
				dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w] + v);
			}
		}
		
		int max = 0;
		
		for (int i = 0; i <= K; i++) {
			max = Math.max(max, dp[N-1][i]);
		}
		
		System.out.println(max);
		
	}

}
