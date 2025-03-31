import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B2_12778_CTP공국으로이민가자 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int M = Integer.parseInt(st.nextToken());
			char C = st.nextToken().charAt(0);
			
			if(C == 'C') {
				st = new StringTokenizer(br.readLine());
				for (int i = 0; i < M; i++) {
					int n = st.nextToken().charAt(0)-'A'+1;
					sb.append(n+" ");
				}
			} else if(C == 'N') {
				st = new StringTokenizer(br.readLine());
				for (int i = 0; i < M; i++) {
					int n = 'A' + Integer.parseInt(st.nextToken())-1;
					sb.append((char)n+" ");
				}
			}
			
			sb.setLength(sb.length()-1);
			sb.append("\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
		
	}

}
