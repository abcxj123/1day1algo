import java.util.Scanner;

public class BOJ_B2_7567_그릇 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int ans = 0;
		char past = '*';
		String str = scann.next();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(past != c) {
				ans += 10;
			} else {
				ans += 5;
			}
			past = c;
		}
		
		System.out.println(ans);

	}

}
