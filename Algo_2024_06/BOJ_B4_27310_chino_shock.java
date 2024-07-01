import java.util.Scanner;

public class BOJ_B4_27310_chino_shock {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.nextLine();
		
		int len = str.length();
		int colon = 0;
		int under = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == ':') colon++;
			else if(c == '_') under++;
		}
		
		System.out.println(len + colon + under * 5);

	}

}
