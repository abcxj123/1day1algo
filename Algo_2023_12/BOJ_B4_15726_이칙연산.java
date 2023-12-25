import java.util.Scanner;

public class BOJ_B4_15726_이칙연산 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		double A = scann.nextDouble();
		double B = scann.nextDouble();
		double C = scann.nextDouble();
		
		double a1 = (A*B)/C;
		double b1 = (A/B)*C;
		
		System.out.println((int) Math.max(a1, b1));

	}

}
