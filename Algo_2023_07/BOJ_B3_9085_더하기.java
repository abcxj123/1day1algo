import java.util.Scanner;

public class BOJ_B3_9085_더하기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int N = scann.nextInt();
			int sum = 0;
			
			for (int i = 0; i < N; i++) {
				sum += scann.nextInt();
			}
			
			System.out.println(sum);
		}

	}

}
