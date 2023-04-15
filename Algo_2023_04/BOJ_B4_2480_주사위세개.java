import java.util.Scanner;

public class BOJ_B4_2480_주사위세개 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int ans = 0;
		
		int a = scann.nextInt();
		int b = scann.nextInt();
		int c = scann.nextInt();
		
		if(a == b && b == c) {
			ans = 10000 + a * 1000;
		} else if(a != b && b != c && a != c) {
			int max = Math.max(a, Math.max(b, c));
			ans = max * 100;
		} else {
			int same = 0;
			if(a == b) {
				same = a;
			} else if(b == c) {
				same = b;
			} else if(a == c) {
				same = a;
			}
			ans = 1000 + same * 100;
		}
		
		System.out.println(ans);

	}

}
