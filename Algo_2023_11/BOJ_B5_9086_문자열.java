import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B5_9086_문자열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			String str = br.readLine();
			
			sb.append(str.charAt(0)).append(str.charAt(str.length()-1)).append("\n");
			
		}
		
		System.out.println(sb.toString());
		
	}

}
