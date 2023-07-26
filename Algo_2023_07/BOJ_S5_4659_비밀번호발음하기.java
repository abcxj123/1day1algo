import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_4659_비밀번호발음하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals("end")) break;
			
			int jaum = 0;
			int moum = 0;
			char past = '0';
			boolean check = true;
			boolean moumCheck = false;
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					moumCheck = true;
					moum++;
					jaum = 0;
				} else {
					jaum++;
					moum = 0;
				}
				
				if(jaum >= 3 || moum >= 3) {
					check = false;
					break;
				}
				
				if(c == past) {
					check = false;
					break;
				}
				
				if(c == 'e' || c =='o') {
					past = '0';
				} else {
					past = c;
				}
				
			}
			
			if(check && moumCheck) {
				sb.append("<"+str+"> is acceptable.\n");
			} else {
				sb.append("<"+str+"> is not acceptable.\n");
			}
			
		}
		
		if(sb.length()>=1) {
			sb.setLength(sb.length()-1);
		}
		
		System.out.println(sb.toString());
		
		
	}

}
