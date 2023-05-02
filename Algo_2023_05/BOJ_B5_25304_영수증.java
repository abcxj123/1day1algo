import java.util.Scanner;

public class BOJ_B5_25304_영수증 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int pay = scann.nextInt();
		int N = scann.nextInt();
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			int a = scann.nextInt();
			int b = scann.nextInt();
			sum += a*b;
		}
		
		if(pay == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
