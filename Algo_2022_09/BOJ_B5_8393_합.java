import java.util.Scanner;

public class BOJ_B5_8393_합 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int n = scann.nextInt();
		int ans = 0;
		
		for (int i = 1; i <= n; i++) {
			ans += i;
		}

		System.out.println(ans);
		
	}

}
