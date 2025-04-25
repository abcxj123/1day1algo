import java.util.Scanner;

public class BOJ_B2_14914_사과와바나나나눠주기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int b = scann.nextInt();
		
		int gcd = getGCD(a, b);
		
		for (int i = 1; i <= gcd; i++) {
			if(gcd % i == 0) {
				System.out.println(i+" "+a/i+" "+b/i);
			}
		}

	}

	private static int getGCD(int a, int b) {
		if(a % b == 0) return b;
		
		return getGCD(b, a%b);
	}

}
