import java.util.Scanner;

public class BOJ_B2_1978_소수찾기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		int ans = 0;
		
		testcase:
			for (int t = 1; t <= T; t++) {
				int n = scann.nextInt();
				if(n == 1) continue;
				
				for (int i = 2; i < n; i++) {
					if(n % i == 0) {
						continue testcase;
					}
				}
				
				ans++;
				
			}
		
		System.out.println(ans);

	}

}
