import java.util.Scanner;

public class BOJ_B3_31472_갈래의색종이자르기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int M = (int) Math.sqrt(2*N);
		
		System.out.println(4*M);

	}

}
