import java.util.Scanner;

public class BOJ_B4_20833_Kuber {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 0;
		
		for (int i = 1; i <= N; i++) {
			ans += i*i*i;
		}
		
		System.out.println(ans);

	}

}
