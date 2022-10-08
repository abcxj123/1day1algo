import java.util.Scanner;

public class BOJ_B2_2675_문자열반복 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int time = scann.nextInt();
			String str = scann.next();
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				for (int j = 0; j < time; j++) {
					sb.append(c);
				}
			}
			
			System.out.println(sb.toString());
			
		}

	}

}
