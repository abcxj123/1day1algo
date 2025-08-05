import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_G4_2240_자두나무 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		// 0: 왼쪽, 1: 오른쪽, 접화식을 위해 W+2로 설정
		int [][][] dp = new int[T+1][W+2][2];
		
		int first = Integer.parseInt(br.readLine());
		
		// 왼쪽이면 가만히 받아먹기
		if(first == 1) {
			dp[1][1][0] = 1;
		// 오른쪽이면 움직여서 받아먹기
		} else {
			dp[1][2][1] = 1;
		}
		
		for (int i = 2; i <= T; i++) {
			int jadu = Integer.parseInt(br.readLine())-1;
			
			for (int j = 1; j <= W+1; j++) {
				dp[i][j][0] = Math.max(dp[i-1][j][0], dp[i-1][j-1][1]);
				dp[i][j][1] = Math.max(dp[i-1][j-1][0], dp[i-1][j][1]);
				
				dp[i][j][jadu]++;
			}
		}
		
		int ans = 0;
		
		for (int i = 1; i <= W+1; i++) {
			ans = Math.max(ans, Math.max(dp[T][i][0], dp[T][i][1]));
		}
		
		System.out.println(ans);
		
	}

}
