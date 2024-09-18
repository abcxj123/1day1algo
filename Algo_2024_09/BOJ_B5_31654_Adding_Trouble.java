import java.util.Scanner;

public class BOJ_B5_31654_Adding_Trouble {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt();
		int B = scann.nextInt();
		int C = scann.nextInt();
		
		if(A + B == C) {
			System.out.println("correct!");
		} else {
			System.out.println("wrong!");
		}

	}

}
