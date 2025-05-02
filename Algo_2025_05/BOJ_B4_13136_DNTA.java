import java.util.Scanner;

public class BOJ_B4_13136_DNTA {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int R = scann.nextInt();
		int C = scann.nextInt();
		int N = scann.nextInt();
		
		long a = R % N == 0 ? R/N : R/N+1;
		long b = C % N == 0 ? C/N : C/N+1;
		
		System.out.println(a*b);

	}

}
