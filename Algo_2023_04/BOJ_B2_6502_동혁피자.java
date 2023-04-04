import java.util.Scanner;

public class BOJ_B2_6502_동혁피자 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int T = 1;
		
		while(true) {
			int R = scann.nextInt();
			if(R == 0) break;
			
			int W = scann.nextInt();
			int L = scann.nextInt();
			
			double length = Math.sqrt(W*W+L*L);
			
			System.out.print("Pizza "+(T++));
			if(length <= R*2) {
				System.out.println(" fits on the table.");
			} else {
				System.out.println(" does not fit on the table.");
			}
		}

	}

}
