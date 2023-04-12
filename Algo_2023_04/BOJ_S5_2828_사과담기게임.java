import java.util.Scanner;

public class BOJ_S5_2828_사과담기게임 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int right = scann.nextInt();
		int J = scann.nextInt();
		int ans = 0;
		
		int left = 1;
		
		for (int i = 0; i < J; i++) {
			int next = scann.nextInt();
			if(next >= left && next <= right) continue;
			else if(next < left) {
				ans += left - next;
				right -= left - next;
				left = next;
			} else {
				ans += next - right;
				left += next - right;
				right = next;
			}
		}
		
		System.out.println(ans);

	}

}
