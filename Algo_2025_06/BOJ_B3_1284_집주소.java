import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_1284_집주소 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String N = br.readLine();
			
			if(N.equals("0")) break;
			
			int l = 1;
			
			for (int i = 0; i < N.length(); i++) {
				char c = N.charAt(i);
				
				if(c == '1') l += 3;
				else if(c == '0') l += 5;
				else l += 4;
			}
			
			System.out.println(l);
			
		}

	}

}
