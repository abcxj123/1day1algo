import java.util.Scanner;

public class BOJ_B2_3052_나머지 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int [] cnt = new int[42];
		int ans = 0;
		
		for (int i = 0; i < 10; i++) {
			int n = scann.nextInt();
			n %= 42;
			cnt[n]++;
		}

		for (int i = 0; i < 42; i++) {
			if(cnt[i] > 0) ans++;
		}
		
		System.out.println(ans);
		
	}

}
