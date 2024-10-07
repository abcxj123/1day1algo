import java.util.Scanner;

public class BOJ_S1_11057_오르막수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int [][] dp = new int[N+1][10];
		
		for (int i = 0; i <= 9; i++) {
			dp[0][i] = 1;
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int l = 0; l <= j; l++) {
					dp[i][j] = (dp[i][j] + (dp[i-1][l])) % 10007;
				}
			}
		}
		
		System.out.println(dp[N][9]);

	}

}
