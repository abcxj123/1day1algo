import java.util.Scanner;

public class BOJ_B2_15813_너의이름은몇점이니 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		scann.nextLine();
		
		String str = scann.nextLine();
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			ans += str.charAt(i) - 'A' + 1;
		}
		
		System.out.println(ans);

	}

}
