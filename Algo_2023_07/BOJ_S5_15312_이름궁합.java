import java.util.Scanner;

public class BOJ_S5_15312_이름궁합 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int [] arr = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		
		String A = scann.next();
		String B = scann.next();
		int length = A.length();
		
		String str = "";
		
		for (int i = 0; i < length; i++) {
			str += arr[A.charAt(i)-'A'];
			str += arr[B.charAt(i)-'A'];
		}
		
		while (str.length() >= 3) {
			String newStr = "";
			int past = str.charAt(0) - '0';
			for (int j = 1; j < str.length(); j++) {
				int now = str.charAt(j) - '0';
				newStr += (past + now) % 10;
				past = now;
			}
			str = newStr;
		}
		
		System.out.println(str);

	}

}
