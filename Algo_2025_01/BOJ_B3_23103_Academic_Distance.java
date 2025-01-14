import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_23103_Academic_Distance {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int px = Integer.parseInt(st.nextToken());
		int py = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
		
			ans += Math.abs(x-px) + Math.abs(y-py);
			px = x;
			py = y;
		}
		
		System.out.println(ans);
		
	}

}
