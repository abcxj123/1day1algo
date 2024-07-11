import java.util.Scanner;

public class BOJ_B5_28444_HIARC {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int H = scann.nextInt();
		int I = scann.nextInt();
		int A = scann.nextInt();
		int R = scann.nextInt();
		int C = scann.nextInt();
		
		System.out.println(H*I - A*R*C);

	}

}
