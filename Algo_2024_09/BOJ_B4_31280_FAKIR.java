import java.util.Scanner;

public class BOJ_B4_31280_FAKIR {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int b = scann.nextInt();
		int c = scann.nextInt();
		int d = scann.nextInt();
		
		int min = Math.min(Math.min(a, b), Math.min(c, d));
		
		System.out.println(a+b+d+c-min+1);

	}

}
