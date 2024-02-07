import java.util.Scanner;

public class BOJ_S5_2018_수들의합5 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 0;
		
		int left = 1;
		int right = 1;
		
		while(left <= N && right <= N) {
			long sum = 0;
			for (int i = left; i <= right; i++) {
				sum += i;
			}
			if(sum < N) {
				right++;
			} else if(sum > N) {
				left++;
			} else {
				ans++;
				left++;
			}
		}
		
		System.out.println(ans);
	}

}
