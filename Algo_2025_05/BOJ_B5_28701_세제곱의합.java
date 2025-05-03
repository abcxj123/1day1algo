import java.util.Scanner;

public class BOJ_B5_28701_세제곱의합 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= N; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		System.out.println(sum*sum);
		
		sum = 0;
		
		for (int i = 0; i <= N; i++) {
			sum += Math.pow(i, 3);
		}
		
		System.out.println(sum);
		

	}

}
