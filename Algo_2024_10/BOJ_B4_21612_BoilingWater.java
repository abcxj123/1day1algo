import java.util.Scanner;

public class BOJ_B4_21612_BoilingWater {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int A = 5*N-400;
		
		System.out.println(A);
		
		if(A > 100) {
			System.out.println(-1);
		} else if(A == 100) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}

	}

}
