import java.util.Scanner;

public class BOJ_B3_2903_중앙이동알고리즘 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int sum = 2;
		
		for (int i = 0; i < N; i++) {
			sum += Math.pow(2, i);
		}
		
		System.out.println(sum*sum);

	}

}
