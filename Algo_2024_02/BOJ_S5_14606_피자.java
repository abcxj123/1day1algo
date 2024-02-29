import java.util.Scanner;

public class BOJ_S5_14606_피자 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		int ans = 0;
		
		for (int i = N-1; i > 0; i--) {
			ans += i;
		}
		
		System.out.println(ans);

	}

}
