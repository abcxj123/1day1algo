import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_16495_열순서 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		long ans = 0;
		
		for (int i = str.length()-1; i >= 0; i--) {
			char c = str.charAt(i);
			ans += (c - 'A' + 1) * Math.pow(26, str.length()-1-i);
		}
		
		System.out.println(ans);
		
	}

}
