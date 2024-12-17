import java.util.Scanner;

public class BOJ_B3_14682_Shifty_Sum {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int K = scann.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= K; i++) {
			sum += N * Math.pow(10, i);
		}
		
		System.out.println(sum);

	}

}
