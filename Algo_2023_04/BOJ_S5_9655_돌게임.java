import java.util.Scanner;

public class BOJ_S5_9655_돌게임 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		if(N % 2 == 0) {
			System.out.println("CY");
		} else {
			System.out.println("SK");
		}

	}

}
