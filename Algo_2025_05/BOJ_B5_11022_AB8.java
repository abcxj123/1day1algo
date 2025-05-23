import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B5_11022_AB8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
		
			int sum = A+B;
			
			sb.append("Case #"+t+": "+A+" + "+B+" "+"= "+sum+"\n");
		
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
