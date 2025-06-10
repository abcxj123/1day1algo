import java.util.Scanner;

public class BOJ_B5_14928_큰수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String N = scann.nextLine();
		long ans = 0;
		
		for (int i = 0; i < N.length(); i++) {
			ans = (ans*10 + (N.charAt(i) -'0')) % 20000303;
		}

		System.out.println(ans);
		
	}

}
