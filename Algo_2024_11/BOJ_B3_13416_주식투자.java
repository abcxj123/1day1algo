import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_13416_주식투자 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
				
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			int sum = 0;
			
			for (int i = 0; i < N; i++) {
				int max = 0;
				
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 3; j++) {
					max = Math.max(max, Integer.parseInt(st.nextToken()));
				}
				
				sum += max;
			}
			
			sb.append(sum+"\n");
		}
		
		if(sb.length() > 0) sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
