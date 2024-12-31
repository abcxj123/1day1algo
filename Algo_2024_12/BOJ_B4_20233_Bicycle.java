import java.util.Scanner;

public class BOJ_B4_20233_Bicycle {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int x = scann.nextInt();
		int b = scann.nextInt();
		int y = scann.nextInt();
		int t = scann.nextInt();
		
		int one = Math.max(0, t-30) * 21 * x + a;
		int two = Math.max(0, t-45) * 21 * y + b;

		System.out.println(one+" "+two);
	}

}
