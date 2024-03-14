import java.util.Scanner;

public class BOJ_S4_20363_당근키우기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int n1 = scann.nextInt();
		int n2 = scann.nextInt();
		
		int min = Math.min(n1, n2);
		
		int ans = n1 + n2 + (min / 10);

		System.out.println(ans);
		
	}

}
