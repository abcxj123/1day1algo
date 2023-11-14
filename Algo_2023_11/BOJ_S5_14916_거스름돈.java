import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_S5_14916_거스름돈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int [] dp = new int[N+1];
		if(N < 5) {
			dp = new int[6];
		}
		
		Arrays.fill(dp, -1);
		
		dp[0] = 0;
		dp[2] = 1;
		dp[4] = 2;
		dp[5] = 1;
		
		for (int i = 6; i <= N; i++) {
			int n1 = dp[i-2];
			int n2 = dp[i-5];
			
			if(n1 == -1 && n2 == -1) {
				dp[i] = -1;
			} else if(n1 == -1) {
				dp[i] = n2+1;
			} else if(n2 == -1) {
				dp[i] = n1+1;
			} else {
				dp[i] = Math.min(n1, n2)+1;
			}
		}
		
		System.out.println(dp[N]);
		
	}

}
