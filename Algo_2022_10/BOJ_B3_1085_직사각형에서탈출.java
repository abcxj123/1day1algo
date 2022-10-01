import java.util.Scanner;

public class BOJ_B3_1085_직사각형에서탈출 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int x = scann.nextInt();
		int y = scann.nextInt();
		int w = scann.nextInt();
		int h = scann.nextInt();
		
		int min = 1000;
		int min2 = 1000;

		min = Math.min(min, w-x);
		min = Math.min(min, x);
		
		min2 = Math.min(min2, h-y);
		min2 = Math.min(min2, y);
		
		System.out.println(Math.min(min, min2));
		
	}

}
