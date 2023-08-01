import java.util.Scanner;

public class BOJ_S3_9461_파도반수열 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = scann.nextInt();
		int [] nums = new int[T];
		
		int max = 0;
		
		for (int i = 0; i < T; i++) {
			int n = scann.nextInt();
			max = Math.max(max, n);
			nums[i] = n;
		}
		
		long [] dp;
		
		if(max <= 5) {
			dp = new long[6];
		} else {
			dp = new long[max+1];
		}
		
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		dp[5] = 2;
		
		for (int i = 6; i <= max; i++) {
			dp[i] = dp[i-1] + dp[i-5];
		}
		
		for (int i = 0; i < T; i++) {
			int n = nums[i];
			sb.append(dp[n]+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
