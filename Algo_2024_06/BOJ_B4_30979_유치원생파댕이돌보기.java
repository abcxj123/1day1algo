import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B4_30979_유치원생파댕이돌보기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		if(sum >= T) {
			System.out.println("Padaeng_i Happy");
		} else {
			System.out.println("Padaeng_i Cry");
		}
		
	}

}
