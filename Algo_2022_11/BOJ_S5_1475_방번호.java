import java.util.Scanner;

public class BOJ_S5_1475_방번호 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String N = scann.next();
		
		int [] cnt = new int[9];
		int max = -1;
		
		for (int i = 0; i < N.length(); i++) {
			char c = N.charAt(i);
			int n = c - '0';
			if(n == 9) cnt[6]++;
			else cnt[n]++;
		}
		
		if(cnt[6] %2 == 0) cnt[6] /= 2;
		else cnt[6] = cnt[6] / 2 + 1;
		
		for (int i = 0; i < 9; i++) {
			max = Math.max(max, cnt[i]);
		}
		
		System.out.println(max);

	}

}
