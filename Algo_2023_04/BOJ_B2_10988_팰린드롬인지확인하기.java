import java.io.IOException;
import java.util.Scanner;

public class BOJ_B2_10988_팰린드롬인지확인하기 {

	public static void main(String[] args) throws IOException {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.next();
		int length = str.length();
		int ans = 1;
		
		for (int i = 0; i < length; i++) {
			char a = str.charAt(i);
			char b = str.charAt(length-1-i);
			
			if(a != b) {
				ans = 0;
				break;
			}
		}
		
		System.out.println(ans);

	}

}
