import java.util.Scanner;

public class BOJ_B4_28248_Delive_droid {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int g = scann.nextInt();
		int l = scann.nextInt();
		
		int ans = g > l ? 500 : 0;
		ans += g*50 - l*10;

		System.out.println(ans);
		
	}

}
