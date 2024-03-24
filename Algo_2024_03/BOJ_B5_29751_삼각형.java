import java.util.Scanner;

public class BOJ_B5_29751_삼각형 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int W = scann.nextInt();
		int H = scann.nextInt();
		
		double ans = (W*H)/2.0;
		
		System.out.printf("%.1f", ans);

	}

}
