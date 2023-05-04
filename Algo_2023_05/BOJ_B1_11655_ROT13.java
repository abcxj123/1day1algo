import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_11655_ROT13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == ' ' || (c >= '0' && c <= '9')) {
				sb.append(c);
			} else {
				if(c >= 'a' && c <= 'z') {
					int n = c - 'a';
					n = (n + 13) % 26;
					char c2 = (char)(n + 'a');
					sb.append(c2);
				} else {
					int n = c - 'A';
					n = (n + 13) % 26;
					char c2 = (char)(n + 'A');
					sb.append(c2);
				}
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
