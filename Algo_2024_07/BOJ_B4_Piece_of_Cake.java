import java.util.Scanner;

public class BOJ_B4_Piece_of_Cake {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int n = scann.nextInt();
		
		int h = scann.nextInt();
		int v = scann.nextInt();
		
		int a = (n-h);
		int b = (n-v);
		
		int max = Math.max(h*v, h*b);
		max = Math.max(max, v*a);
		max = Math.max(max, a*b);
		
		System.out.println(max*4);

	}

}
