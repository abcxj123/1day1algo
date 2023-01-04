import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_1032_명령프롬포트 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String ans = br.readLine();
		
		for (int i = 1; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < ans.length(); j++) {
				char a = ans.charAt(j);
				if(a == '?') continue;
				
				char b = str.charAt(j);
				
				if(a != b) {
					StringBuilder sb = new StringBuilder(ans);
					sb.setCharAt(j, '?');
					ans = sb.toString();
				}
			}
		}
		
		System.out.println(ans);

	}

}
