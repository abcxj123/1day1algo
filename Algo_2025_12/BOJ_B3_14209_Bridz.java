import java.util.Scanner;

public class BOJ_B3_14209_Bridz {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		scann.nextLine();
		
		int sum = 0;
		
		for (int t = 0; t < T; t++) {
			String s = scann.nextLine();
			
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				
				if(c == 'A') sum += 4;
				else if(c == 'K') sum += 3;
				else if(c == 'Q') sum += 2;
				else if(c == 'J') sum++;
			}
			
		}
		
		System.out.println(sum);

	}

}
