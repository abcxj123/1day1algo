import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_8958_OX퀴즈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			String str = br.readLine();
			int combo = 0;
			int total = 0;
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(c == 'O') {
					total += ++combo;
				} else {
					combo = 0;
				}
			}
			
			System.out.println(total);
			
		}
	}

}
