import java.util.Scanner;

public class BOJ_B4_24196_Gomda_ord {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = scann.nextLine();
		
		int idx = 0;
		
		while (idx < str.length()) {
			char c = str.charAt(idx);
			
			sb.append(c);
			
			idx += c - 'A' + 1;
		}
		
		System.out.println(sb.toString());

	}

}
