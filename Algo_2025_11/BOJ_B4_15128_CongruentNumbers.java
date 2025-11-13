import java.util.Scanner;

public class BOJ_B4_15128_CongruentNumbers {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		double p1 = scann.nextDouble();
		double q1 = scann.nextDouble();
		double p2 = scann.nextDouble();
		double q2 = scann.nextDouble();
		
		if((p1*p2) % (q1*q2*2) == 0) System.out.println(1);
		else System.out.println(0);

	}

}
