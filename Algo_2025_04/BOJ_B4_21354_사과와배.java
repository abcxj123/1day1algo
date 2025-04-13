import java.util.Scanner;

public class BOJ_B4_21354_사과와배 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt() * 7;
		int P = scann.nextInt() * 13;
		
		if(A > P) System.out.println("Axel");
		else if(A < P) System.out.println("Petra");
		else System.out.println("lika");

	}

}
