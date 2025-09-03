import java.util.Scanner;

public class BOJ_B2_5586_JOI와IOI {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String s = scann.nextLine();
		
		int joi = 0;
		int ioi = 0;
		
		for (int i = s.length()-1; i >= 2; i--) {
			if(s.charAt(i) == 'I' && s.charAt(i-1) == 'O') {
				char c = s.charAt(i-2);
				
				if(c == 'I') ioi++;
				else if(c == 'J') joi++;
			}
		}
		
		System.out.println(joi);
		System.out.println(ioi);

	}

}
