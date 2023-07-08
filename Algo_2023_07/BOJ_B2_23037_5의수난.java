import java.util.Scanner;

public class BOJ_B2_23037_5의수난 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int sum = 0;
		
		while(N > 0) {
			int n = N % 10;
			sum += Math.pow(n, 5);
			N /= 10;
		}
		
		System.out.println(sum);

	}

}
