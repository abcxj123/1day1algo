import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_10820_문자열분석 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = null;
		
		while ((str = br.readLine()) != null) {
			int small = 0;
			int big = 0;
			int num = 0;
			int blank = 0;
			
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if(c == ' ') {
					blank++;
				} else if(c >= 'a' && c <= 'z') {
					small++;
				} else if(c >= 'A' && c <= 'Z') {
					big++;
				} else if(c >= '0' && c <= '9') {
					num++;
				}
			}
			
			System.out.println(small+" "+big+" "+num+" "+blank);
			
		}

	}

}
