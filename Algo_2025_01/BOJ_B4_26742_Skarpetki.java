import java.util.Scanner;

public class BOJ_B4_26742_Skarpetki {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.nextLine();
		
		int B = 0;
		int C = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == 'B') B++;
			else C++;
		}

		System.out.println(B/2 + C/2);
		
	}

}
