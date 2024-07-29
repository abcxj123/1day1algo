import java.util.Scanner;

public class BOJ_B4_15059_Hard_choice {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int ans = 0;
		
		int a1 = scann.nextInt();
		int b1 = scann.nextInt();
		int c1 = scann.nextInt();
		
		int a2 = scann.nextInt();
		int b2 = scann.nextInt();
		int c2 = scann.nextInt();
		
		ans += Math.max(a2-a1, 0);
		ans += Math.max(b2-b1, 0);
		ans += Math.max(c2-c1, 0);
		
		System.out.println(ans);
		
	}

}
