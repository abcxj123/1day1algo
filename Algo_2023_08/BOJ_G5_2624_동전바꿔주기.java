import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_G5_2624_동전바꿔주기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int [] dp = new int[T+1];
		dp[0] = 1;
		
		for (int i = 0; i < k; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			for (int j = T; j > 0 ; j--) {
				int sum = 0;
				
				for (int l = 0; l < n; l++) {
					sum += p;
					if(j - sum < 0) break;
					dp[j] += dp[j - sum];
				}
			}
			
		}
		
		System.out.println(dp[T]);
		
	}

}
