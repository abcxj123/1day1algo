import java.util.Scanner;

public class BOJ_B1_2748_피보나치수2 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		if(N == 1) {
			System.out.println(1);
		} else {
			long [] dp = new long[N+1];
			dp[0] = 0;
			dp[1] = 1;
			
			for (int i = 2; i <= N; i++) {
				dp[i] = dp[i-1] + dp[i-2];
			}
			
			System.out.println(dp[N]);
			
		}

	}

}
