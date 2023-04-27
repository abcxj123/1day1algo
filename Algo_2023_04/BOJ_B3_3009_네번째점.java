import java.util.Scanner;

public class BOJ_B3_3009_네번째점 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int x1 = scann.nextInt();
		int y1 = scann.nextInt();
		int x2 = scann.nextInt();
		int y2 = scann.nextInt();
		int x3 = scann.nextInt();
		int y3 = scann.nextInt();
		
		int x = x1 == x2 ? x3 : x1 == x3 ? x2 : x1;
		int y = y1 == y2 ? y3 : y1 == y3 ? y2 : y1;
		
		System.out.println(x+" "+y);

	}

}
