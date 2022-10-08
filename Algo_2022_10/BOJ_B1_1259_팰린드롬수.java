import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_1259_팰린드롬수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String str = br.readLine();
			
			if(str.equals("0")) {
				break;
			}
			
			int start = 0;
			int length = str.length();
			int end = length - 1;
			boolean flag = true;
			
			for (int i = 0; i < length/2; i++) {
				if(str.charAt(start) != str.charAt(end)) {
					flag = false;
					break;
				}
				start++;
				end--;
			}
			
			if(flag) System.out.println("yes");
			else System.out.println("no");
			
		}
		
	}

}
