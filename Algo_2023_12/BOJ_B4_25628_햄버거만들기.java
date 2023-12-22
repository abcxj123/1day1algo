import java.util.Scanner;

public class BOJ_B4_25628_햄버거만들기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt() / 2;
		int B = scann.nextInt();
		
		System.out.println(Math.min(A, B));

	}

}
