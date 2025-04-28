import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_10409_서버 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int ans = 0;
		int sum = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			sum += Integer.parseInt(st.nextToken());
			
			if(sum > T) break;
			
			ans++;
		}
		
		System.out.println(ans);
		
	}

}
