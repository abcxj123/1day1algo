import java.util.Scanner;

public class BOJ_B3_2721_삼각수의합 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		
		for (int t = 0; t < T; t++) {
			int sum = 0;
			int N = scann.nextInt();
			
			for (int i = 1; i <= N; i++) {
				int x = 0;
				
				for (int k = 1; k <= (i+1); k++) {
					x += k;
				}
				
				sum += (i*x);
				
			}
			
			System.out.println(sum);
			
		}

	}

}
