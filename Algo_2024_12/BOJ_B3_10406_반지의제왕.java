import java.util.Scanner;

public class BOJ_B3_10406_반지의제왕 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int W = scann.nextInt();
		int N = scann.nextInt();
		int P = scann.nextInt();
		int ans = 0;
		
		for (int i = 0; i < P; i++) {
			int n = scann.nextInt();
			
			if(n >= W && n <= N) ans++;
		}
		
		System.out.println(ans);

	}

}
