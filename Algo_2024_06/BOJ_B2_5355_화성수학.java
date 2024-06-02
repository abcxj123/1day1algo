import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B2_5355_화성수학 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			double ans = Double.parseDouble(st.nextToken());
			
			while(st.hasMoreTokens()) {
				char c = st.nextToken().charAt(0);
				
				switch(c) {
				case '@':
					ans *= 3;
					
					break;
				case '%':
					ans += 5;
					
					break;
					
				case '#':
					ans -= 7;
					
					break;
					
				default:
					break;
				}
			}
			
			sb.append(String.format("%.2f", ans)+"\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
