import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_29340_OTPRA {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < a.length(); i++) {
			int a1 = a.charAt(i) - '0';
			int b1 = b.charAt(i) - '0';
			
			sb.append(Math.max(a1, b1));
		}
		
		System.out.println(sb.toString());
		
	}

}
