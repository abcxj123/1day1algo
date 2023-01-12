import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B4_26546_Reverse {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringBuilder sb = new StringBuilder();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(str.substring(0, a));
			sb.append(str.substring(b, str.length()));
			
			System.out.println(sb.toString());
		}

	}

}
