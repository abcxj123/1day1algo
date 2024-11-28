import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_Chanukah_Challenge {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int P = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < P; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int K = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			sb.append(K+" ");
			
			int ans = N;
			for (int j = 1; j <= N; j++) {
				ans += j;
			}
			
			sb.append(ans+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
	}

}
