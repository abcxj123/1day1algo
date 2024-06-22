import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_31867_홀짝홀짝 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String num = br.readLine();
		
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < N; i++) {
			int n = num.charAt(i) - '0';
			if(n % 2 == 0) even++;
			else odd++;
		}
		
		if(odd > even) System.out.println(1);
		else if(odd < even) System.out.println(0);
		else System.out.println(-1);
		
		
	}

}
