import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_31608_Hamming_Distance {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str1 = br.readLine();
		String str2 = br.readLine();
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);
			
			if(c1 != c2) ans++;
		}
		
		System.out.println(ans);

	}

}
