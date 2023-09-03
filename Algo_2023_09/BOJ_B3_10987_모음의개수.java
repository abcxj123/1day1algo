import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_10987_모음의개수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int ans = 0;
		
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ans++;
		}
		
		System.out.println(ans);
		
	}

}
