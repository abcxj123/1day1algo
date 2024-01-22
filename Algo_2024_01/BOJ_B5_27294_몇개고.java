import java.util.Scanner;

public class BOJ_B5_27294_몇개고 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		int S = scann.nextInt();
		
		if(S == 1 || (T <= 11 || T > 16)) {
			System.out.println(280);
		} else {
			System.out.println(320);
		}

	}

}
