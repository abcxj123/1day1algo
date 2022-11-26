import java.util.Scanner;

public class BOJ_B2_10870_피보나치수5 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		int [] dp = new int[N+3];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i=3;i<=N;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		System.out.println(dp[N]);

	}

}
