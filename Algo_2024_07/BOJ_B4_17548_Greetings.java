import java.util.Scanner;

public class BOJ_B4_17548_Greetings {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = scann.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'e') sb.append('e');
			sb.append(c);
		}
		
		System.out.println(sb.toString());

	}

}
