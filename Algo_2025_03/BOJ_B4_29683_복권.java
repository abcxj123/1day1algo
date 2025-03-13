import java.util.Scanner;

public class BOJ_B4_29683_복권 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int A = scann.nextInt();
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			ans += n / A;
		}
		
		System.out.println(ans);

	}

}
