import java.util.Scanner;

public class BOJ_B1_11050_이항계수1 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int K = scann.nextInt();
		int ans = 1;
		
		for (int i = 0; i < K; i++) {
			ans *= N;
			N--;
		}
		
		int div = 1;
		
		for (int i = K; i > 1; i--) {
			div *= i;
		}
		
		System.out.println(ans / div);

	}

}
