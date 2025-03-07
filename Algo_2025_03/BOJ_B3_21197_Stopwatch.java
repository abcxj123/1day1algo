import java.util.Scanner;

public class BOJ_B3_21197_Stopwatch {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		if(N % 2 != 0) {
			for (int i = 0; i < N; i++) {
				scann.nextInt();
			}
			
			System.out.println("still running");
		} else {
			int ans = 0;
			
			for (int i = 0; i < N; i++) {
				int n = scann.nextInt();
				
				if(i % 2 == 0) ans -= n;
				else ans += n;
			}
			
			System.out.println(ans);
		}

	}

}
