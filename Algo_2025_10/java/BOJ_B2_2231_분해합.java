import java.util.Scanner;

public class BOJ_B2_2231_분해합 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		int ans = 0;
		
		for (int i = 1; i <= N; i++) {
			int num = i;
			
			int sum = 0;
			
			while(num > 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if(sum+i == N) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);

	}

}
