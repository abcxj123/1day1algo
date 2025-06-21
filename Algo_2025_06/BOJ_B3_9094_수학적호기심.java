import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_9094_수학적호기심 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int ans = 0;
			
			for (int a = 1; a < N; a++) {
				for (int b = a+1; b < N; b++) {
					double cal = (a*a + b*b + M * 1.0) / (a*b);
					
					if((int)cal == cal) ans++;
				}
			}
			
			sb.append(ans+"\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
