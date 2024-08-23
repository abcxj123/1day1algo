import java.util.Scanner;

public class BOJ_B4_28224_FinalPrice {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			ans += scann.nextInt();
		}

		System.out.println(ans);
		
	}

}
