import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_15881_PenPineappleApplePen {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		String str = br.readLine();
		
		for (int i = 0; i < N-3; i++) {
			if(str.charAt(i) == 'p' && str.charAt(i+1) == 'P' && str.charAt(i+2) == 'A' && str.charAt(i+3) == 'p') {
				cnt++;
				i += 3;
			}
		}
		
		System.out.println(cnt);
		
	}

}
