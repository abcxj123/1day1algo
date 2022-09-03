import java.util.Scanner;

public class BOJ_B2_2577_숫자의개수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt();
		int B = scann.nextInt();
		int C = scann.nextInt();
		
		int [] cnt = new int[10];
		
		String str = Long.toString(A*B*C);
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int n = c - '0';
			cnt[n]++;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(cnt[i]);
		}
	}

}
