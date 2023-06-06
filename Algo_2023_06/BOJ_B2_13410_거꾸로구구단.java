import java.util.Scanner;

public class BOJ_B2_13410_거꾸로구구단 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int K = scann.nextInt();
		int max = 0;
		
		for (int i = 1; i <= K; i++) {
			int n = N * i;
			int rev = reverse(n);
			max = Math.max(max, rev);
		}
		
		System.out.println(max);

	}

	private static int reverse(int n) {
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		
		return Integer.parseInt(sb.reverse().toString());
	}

}
