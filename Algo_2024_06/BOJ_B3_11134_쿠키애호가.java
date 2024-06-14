import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_11134_쿠키애호가 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			int ans = N/C;
			if(N % C != 0) ans++;
			
			sb.append(ans+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
