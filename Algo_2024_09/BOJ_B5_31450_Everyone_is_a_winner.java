import java.util.Scanner;

public class BOJ_B5_31450_Everyone_is_a_winner {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int M = scann.nextInt();
		
		if(N % M == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
