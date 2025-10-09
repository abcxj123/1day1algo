import java.util.Scanner;

public class BOJ_B2_7572_간지 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		char [] gan = "0123456789".toCharArray();
		char [] zi = "ABCDEFGHIJKL".toCharArray();
		
		char g = gan[((N+6) % 10)];
		char z = zi[((N+8) % 12)];
		
		System.out.print(z);
		System.out.println(g);

	}

}
