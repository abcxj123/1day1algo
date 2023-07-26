import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S4_22351_수학은체육과목입니다3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		if(str.length() < 4) {
			char c = str.charAt(0);
			boolean check = true;
			
			for (int i = 1; i < str.length(); i++) {
				if(str.charAt(i) != c) {
					check = false;
					break;
				}
			}
			
			if(check) {
				System.out.println(str+" "+str);
				System.exit(0);
			}
			
		}
		
		int start = str.charAt(0) - '0';
		int end = 0;
		
		for (int i = start; i <= 998; i++) {
			StringBuilder sb = new StringBuilder();
			boolean find = false;
			
			for (int j = i; j <= 999; j++) {
				sb.append(j);
				if(!str.startsWith(sb.toString())) {
					break;
				} else if(sb.toString().equals(str)) {
					start = i;
					end = j;
					find = true;
					break;
				}
			}
			
			if(find) break;
			
		}
		
		System.out.println(start+" "+end);
		
	}

}
