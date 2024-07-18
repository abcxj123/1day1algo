import java.util.Scanner;

public class BOJ_B4_26736_Wynik_meczu {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

		String str = scann.nextLine();
		
		int A = 0;
		int B = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'A') A++;
			else B++;
		}
		
		System.out.println(A+" : "+B);
		
	}

}
