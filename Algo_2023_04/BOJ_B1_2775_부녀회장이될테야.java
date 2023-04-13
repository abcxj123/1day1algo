import java.util.Scanner;

public class BOJ_B1_2775_부녀회장이될테야 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int N = scann.nextInt();
			int K = scann.nextInt();
			int [][] dp = new int[N+1][K+1];
			
			for (int i = 1; i <= K; i++) {
				dp[0][i] = i;
			}
			
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= K; j++) {
					dp[i][j] = dp[i-1][j] + dp[i][j-1];
				}
			}
			
			System.out.println(dp[N][K]);
			
		}

	}

}
