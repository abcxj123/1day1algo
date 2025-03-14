import java.util.Scanner;

public class BOJ_B3_15272_HM {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String s = scann.nextLine();
		
		boolean isS = false;
		boolean isHiss = false;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == 's') {
				if(isS) {
					isHiss = true;
					break;
				} 
				isS = true;
			} else {
				isS = false;
			}
		}
		
		if(isHiss) System.out.println("hiss");
		else System.out.println("no hiss");

	}

}
