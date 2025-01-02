import java.util.Scanner;

public class BOJ_B4_28352_10 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		int ans = 6;
		
		for (int i = 11; i <= N; i++) {
			ans *= i;
		}
		
		System.out.println(ans);

	}

}
