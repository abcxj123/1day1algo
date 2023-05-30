import java.util.Scanner;

public class BOJ_B4_5596_시험점수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < 4; i++) {
			a += scann.nextInt();
		}
		
		for (int i = 0; i < 4; i++) {
			b+= scann.nextInt();
		}
		
		System.out.println(Math.max(a, b));

	}

}
