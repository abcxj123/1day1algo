import java.util.Scanner;

public class BOJ_B4_11720_숫자의합 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int sum = 0;
		
		String str = scann.next();
		
		for (int i = 0; i < str.length(); i++) {
			int n = str.charAt(i) - '0';
			sum += n;
		}
		
		System.out.println(sum);

	}

}
