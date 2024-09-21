import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_30156_ballons {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			String str = br.readLine();
			
			int a = 0;
			int b = 0;
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if(c == 'a') a++;
				else if(c == 'b') b++;
			}
			
			sb.append(Math.min(a, b)+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
