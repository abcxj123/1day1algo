import java.util.Scanner;

public class BOJ_B3_16673_고려대학교에는공식와인이있다 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int C = scann.nextInt();
		int K = scann.nextInt();
		int P = scann.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= C; i++) {
			sum += K*i + P*i*i;
		}
		
		System.out.println(sum);

	}

}
