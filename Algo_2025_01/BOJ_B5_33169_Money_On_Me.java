import java.util.Scanner;

public class BOJ_B5_33169_Money_On_Me {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int ans = 0;
		
		ans += 1000 * scann.nextInt();
		ans += 10000 * scann.nextInt();

		System.out.println(ans);
		
	}

}
