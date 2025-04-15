import java.util.Scanner;

public class BOJ_B3_15633_Fan_Death {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		int ans = 0;
		
		for (int i = 1; i <= N; i++) {
			if(N % i == 0) ans += i;
		}

		System.out.println(ans*5-24);
		
	}

}
