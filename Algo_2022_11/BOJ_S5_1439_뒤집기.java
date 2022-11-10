import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_1439_뒤집기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int zero = 0;
		int one = 0;
		boolean isZero = true;
		
		char past = s.charAt(0);
		if(past == '0') {
			zero++;
			isZero = true;
		}
		else {
			one++;
			isZero = false;
		}
		
		for (int i = 1; i < s.length(); i++) {
			char now = s.charAt(i);
			if(now == '0') {
				if(isZero) continue;
				
				isZero = true;
				zero++;
			} else if(now == '1') {
				if(!isZero) continue;
				
				isZero = false;
				one++;
			}	
		}
		
		System.out.println(Math.min(zero, one));

	}

}
