import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_3059_등장하지않는문자의합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			String str = br.readLine();
			
			boolean [] arr = new boolean[26];
			int ans = 0;
			
			for (int i = 0; i < str.length(); i++) {
				int n = str.charAt(i) - 'A';
				arr[n] = true;
			}
			
			for (int i = 0; i < 26; i++) {
				if(!arr[i]) {
					ans += (i + 65);
				}
			}
			
			sb.append(ans+"\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
