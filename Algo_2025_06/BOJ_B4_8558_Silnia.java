import java.util.Scanner;

public class BOJ_B4_8558_Silnia {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 1;
		
		for (int i = 2; i <= Math.min(6, N); i++) {
			ans = (ans * i) % 10;
		}
		
		System.out.println(ans);

	}

}
