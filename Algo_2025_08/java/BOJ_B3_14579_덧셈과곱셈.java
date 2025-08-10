import java.util.Scanner;

public class BOJ_B3_14579_덧셈과곱셈 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int b = scann.nextInt();
		
		int plus = 0;
		
		for (int i = 1; i < a; i++) {
			plus += i;
		}
		
		int ans = 1;
		
		for (int i = a; i <= b; i++) {
			plus += i;
			
			ans = (ans * plus) % 14579;
		}
		
		System.out.println(ans);
		
		
	}

}
