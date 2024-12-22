import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_25630_팰린드롬소떡소떡 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int ans = 0;
		
		for (int i = 0; i < N/2; i++) {
			char c1 = str.charAt(0+i);
			char c2 = str.charAt(N-1-i);
			
			if(c1 != c2) ans++;
		}
		
		System.out.println(ans);
		
	}

}
