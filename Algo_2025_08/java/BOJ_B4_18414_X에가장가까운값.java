import java.util.Scanner;

public class BOJ_B4_18414_X에가장가까운값 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int X = scann.nextInt();
		int L = scann.nextInt();
		int R = scann.nextInt();

		if(L <= X && R >= X) System.out.println(X);
		else if(X < L) System.out.println(L);
		else System.out.println(R);
		
	}

}
