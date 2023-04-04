import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_1343_폴리오미노 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		int stack = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'X') stack++;
			else if(c == '.') {
				if(stack == 2) {
					sb.append("BB.");
					stack = 0;
				} else if (stack == 0) {
					sb.append(".");
				} else {
					System.out.println(-1);
					System.exit(0);
				}
			}
			
			if(stack == 4) {
				sb.append("AAAA");
				stack = 0;
			}
		}
		
		if(stack == 2) {
			sb.append("BB");
		} else if (stack > 0) {
			System.out.println(-1);
			System.exit(0);
		}
		
		System.out.println(sb.toString());
		
	}

}
