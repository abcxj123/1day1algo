import java.util.Scanner;

public class BOJ_B1_17294_귀여운수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.next();
		
		if(str.length() <= 2) {
			System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
		} else {
			int first = str.charAt(0) - '0';
			int second = str.charAt(1) - '0';
			int diff = second - first;
			int past = second;
			boolean check = false;
			
			for (int i = 2; i < str.length(); i++) {
				int now = str.charAt(i) - '0';
				if(now - past != diff) {
					check = true;
					break;
				}
				past = now;
			}
			
			if(check) {
				System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
			} else {
				System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
			}
		}

	}

}
