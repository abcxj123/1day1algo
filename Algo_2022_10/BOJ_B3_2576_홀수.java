import java.util.Scanner;

public class BOJ_B3_2576_홀수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int sum = 0;
		int min = 101;
		
		for (int i = 0; i < 7; i++) {
			int n = scann.nextInt();
			
			if(n % 2 == 1) {
				sum += n;
				min = Math.min(min, n);
			}
		}
		
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		

	}

}
