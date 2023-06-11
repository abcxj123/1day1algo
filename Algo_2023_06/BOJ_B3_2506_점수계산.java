import java.util.Scanner;

public class BOJ_B3_2506_점수계산 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int sum = 0;
		int cnt = 1;
		
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			if(n == 1) {
				sum += cnt++;
			} else {
				cnt = 1;
			}
		}
		
		System.out.println(sum);

	}

}
