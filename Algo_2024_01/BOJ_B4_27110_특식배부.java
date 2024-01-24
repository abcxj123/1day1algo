import java.util.Scanner;

public class BOJ_B4_27110_특식배부 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int A = scann.nextInt();
		int B = scann.nextInt();
		int C = scann.nextInt();
		
		int sum = 0;
		sum += Math.min(N, A);
		sum += Math.min(N, B);
		sum += Math.min(N, C);
		
		System.out.println(sum);

	}

}
