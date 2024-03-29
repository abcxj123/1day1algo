import java.util.Scanner;

public class BOJ_S3_2193_이친수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		// 자릿수 + 마지막숫자 0 1 여부
		long [][] dp = new long[N+1][2];
		
		dp[1][1] = 1;
		
		for (int i = 2; i <= N; i++) {
			dp[i][0] = dp[i-1][0] + dp[i-1][1];
			dp[i][1] = dp[i-1][0];
		}
		
		System.out.println(dp[N][0] + dp[N][1]);

	}

}
