import java.util.Scanner;

public class BOJ_B3_3034_앵그리창영 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int W = scann.nextInt();
		int H = scann.nextInt();
		
		int length = (int) Math.sqrt(W*W + H*H);
		
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			if(n <= length) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}

	}

}
