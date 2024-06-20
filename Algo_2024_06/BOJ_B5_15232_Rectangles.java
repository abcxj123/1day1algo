import java.util.Scanner;

public class BOJ_B5_15232_Rectangles {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int R = scann.nextInt();
		int C = scann.nextInt();
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
