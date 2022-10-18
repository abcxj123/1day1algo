import java.util.Scanner;

public class BOJ_B5_2475_검증수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int n = scann.nextInt();
			sum += n*n;
		}
		
		System.out.println(sum%10);

	}

}
