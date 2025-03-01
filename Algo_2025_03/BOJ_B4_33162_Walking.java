import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_33162_Walking {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		
		ans += ((N+1)/2) * 3;
		ans -= (N/2) * 2;
		
		System.out.println(ans);

	}

}
