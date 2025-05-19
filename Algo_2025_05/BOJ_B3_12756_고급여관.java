import java.util.Scanner;

public class BOJ_B3_12756_고급여관 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a1 = scann.nextInt();
		int a2 = scann.nextInt();
		int b1 = scann.nextInt();
		int b2 = scann.nextInt();

		while(a2 > 0 && b2 > 0) {
			a2 -= b1;
			b2 -= a1;
		}
		
		if(a2 <= 0 && b2 <= 0) System.out.println("DRAW");
		else if(b2 <= 0) System.out.println("PLAYER A");
		else System.out.println("PLAYER B");
		
		
	}

}
