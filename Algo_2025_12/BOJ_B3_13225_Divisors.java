import java.util.Scanner;

public class BOJ_B3_13225_Divisors {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int [][] nums = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			nums[i][0] = n;
			int cnt = 0;
			
			for (int j = 1; j <= n; j++) {
				if(n % j == 0) cnt++;
			}
			
			nums[i][1] = cnt;
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(nums[i][0]+" "+nums[i][1]);
		}
	}

}
