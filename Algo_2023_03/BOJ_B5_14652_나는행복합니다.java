import java.util.Scanner;

public class BOJ_B5_14652_나는행복합니다 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int M = scann.nextInt();
		int K = scann.nextInt();
		
		System.out.println(K/M+" "+K%M);

	}

}
