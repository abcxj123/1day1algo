import java.util.Scanner;

public class BOJ_B4_28648_쇼핑센터 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < N; i++) {
			int a = scann.nextInt();
			int b = scann.nextInt();
			
			min = Math.min(min, a+b);
		}
		
		System.out.println(min);

	}

}
