import java.util.Scanner;

public class BOJ_B5_2744_대소문자바꾸기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = scann.next();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(Character.toUpperCase(c));
			}
		}
		
		System.out.println(sb.toString());

	}

}
