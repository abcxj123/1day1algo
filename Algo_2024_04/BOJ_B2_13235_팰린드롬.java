import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_13235_팰린드롬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int start = 0;
		int last = str.length()-1;
		
		boolean check = true;
		
		while(start < last) {
			char c1 = str.charAt(start);
			char c2 = str.charAt(last);
			
			if(c1 != c2) {
				check = false;
				break;
			}
			
			start++;
			last--;
		}
		
		if(check) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}

}
