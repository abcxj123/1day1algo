import java.util.Scanner;

public class BOJ_B4_17356_욱제 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt();
		int B = scann.nextInt();
		
		double M = (B - A) / 400.0;
		
		double ans = 1 / (1 + Math.pow(10, M));
		
		System.out.println(ans);

	}

}
