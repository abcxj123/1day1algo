import java.util.Scanner;

public class BOJ_B3_10707_수도요금 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int b = scann.nextInt();
		int c = scann.nextInt();
		int d = scann.nextInt();
		int e = scann.nextInt();
		
		int x = a*e;
		int y = b;
		
		if(e > c) y += (e - c) * d;
		
		System.out.println(Math.min(x, y));

	}

}
