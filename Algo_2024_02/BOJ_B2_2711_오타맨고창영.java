import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B2_2711_오타맨고창영 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int idx = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			int length = str.length();
			
			sb.append(str.substring(0, idx-1) + str.substring(idx, length)).append('\n');
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
