import java.util.Scanner;

public class BOJ_B5_27959_초코바 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int M = scann.nextInt();
		
		if(N*100 >= M) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
