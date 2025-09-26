import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_17389_보너스점수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		int ans = 0;
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			if(s.charAt(i) == 'O') {
				ans += i + (cnt++) + 1;
			}else {
				cnt = 0;
			}
		}
		
		System.out.println(ans);

	}

}
