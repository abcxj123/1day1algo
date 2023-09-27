import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_25644_최대상승 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int min = Integer.MAX_VALUE;
		int ans = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(n < min) {
				min = n;
			} else {
				ans = Math.max(ans, n - min);
			}
		}
		
		System.out.println(ans);
		
	}

}
