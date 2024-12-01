import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_27325_Three_Boxes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int ball = 1;
		int ans = 0;
		String str = br.readLine();
		
		for (int i = 0; i < N; i++) {
			char c = str.charAt(i);
			
			if(c == 'L') {
				ball = Math.max(1, ball-1);
			} else {
				ball = Math.min(3, ball+1);
			}
			
			if(ball == 3) ans++;
		}
		
		System.out.println(ans);

	}

}
