import java.util.Scanner;

public class BOJ_B3_2588_곱셈 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int M = scann.nextInt();
		
		int m1 = M / 100;
		int m2 = (M - m1*100) / 10;
		int m3 = M - m1*100 - m2*10;
		
		System.out.println(N * m3);
		System.out.println(N * m2);
		System.out.println(N * m1);
		System.out.println(N * M);

	}

}
