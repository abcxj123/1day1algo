import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_30868_개표 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < n/5; i++) {
				sb.append("++++ ");
			}
			
			for (int i = 0; i < n%5; i++) {
				sb.append("|");
			}
			
			if(n % 5 == 0) sb.setLength(sb.length()-1);
			sb.append("\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
