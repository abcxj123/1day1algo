import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S3_2579_계단오르기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		// 계단의 점수를 저장할 배열
		int [] stair = new int[N+1];
		// dp[i][j] : i번째 계단까지 도달했을 때 받을 수 있는 최대 점수
		// j의 범위 : 0~1, 현재 계단을 기준으로 한 계단을 오른 연속 횟수.
		// 한 계단을 연속해서 2번 오르면 세 개의 계단이 연속되므로 범위는 0~1만 가능하다.
		int [][] dp = new int[N+1][2];
		
		for (int i = 1; i <= N; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		
		// 계단의 높이가 1인 경우는 값을 출력하고 바로 종료한다.
		if(N == 1) {
			System.out.println(stair[1]);
			System.exit(0);
		}
		
		// dp 배열의 초기값 설정. 1, 2층의 경우에는 해당 경우의 수밖에 없다.
		dp[1][0] = stair[1];
		dp[2][0] = stair[2];
		dp[2][1] = stair[1] + stair[2];
		
		for (int i = 3; i <= N; i++) {
			// i번째 계단에 도착하면서 한 계단을 오른 연속 횟수가 0이 되는 경우는
			// i-2번째 계단에서 2칸을 뛰어 올라온 경우이다. (연속 횟수 0, 1 상관X)
			dp[i][0] = Math.max(dp[i-2][0], dp[i-2][1]) + stair[i];
			// i번째 계단이 도착하면서 한 계단을 오른 연속 횟수가 1이 되는 경우는
			// i-1번째 계단에서 1칸을 뛰어 올라온 경우밖에 없다.
			dp[i][1] = dp[i-1][0] + stair[i];
		}
		
		// N번째 계단까지 오른 두 가지 경우의 수 중 큰 값을 출력한다.
		int max = Math.max(dp[N][0], dp[N][1]);
		System.out.println(max);
		
	}

}
