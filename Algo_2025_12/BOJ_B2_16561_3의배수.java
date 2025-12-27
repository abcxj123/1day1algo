import java.util.Scanner;

public class BOJ_B2_16561_3의배수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int cnt = 0;
		int sum = 0;

		for (int i = 1; i < N/3; i++) {
			for (int j = 1; j < N/3; j++) {
				sum = i*3 + j*3;
				if (N-sum > 0) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);
	}

}
