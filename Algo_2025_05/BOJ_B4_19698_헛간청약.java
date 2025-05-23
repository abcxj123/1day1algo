import java.util.Scanner;

public class BOJ_B4_19698_헛간청약 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int W = scann.nextInt();
		int H = scann.nextInt();
		int L = scann.nextInt();
		
		W /= L;
		H /= L;
		
		System.out.println(Math.min(N, W*H));

	}

}
