import java.util.Scanner;

public class BOJ_B5_28113_정보섬의대중교통 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int A = scann.nextInt();
		int B = scann.nextInt();
		
		if(N > B || A < B) {
			System.out.println("Bus");
		} else if(A > B) {
			System.out.println("Subway");
		} else if(A == B) {
			System.out.println("Anything");
		}

	}

}
