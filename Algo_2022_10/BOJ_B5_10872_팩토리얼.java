import java.util.Scanner;

public class BOJ_B5_10872_팩토리얼 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		if(N == 0) System.out.println(1);
		else {
			int ans = 1;
			for (int i = 1; i <= N; i++) {
				ans *= i;
			}
			System.out.println(ans);
		}

	}

}
