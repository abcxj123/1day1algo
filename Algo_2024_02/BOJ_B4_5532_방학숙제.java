import java.util.Scanner;

public class BOJ_B4_5532_방학숙제 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int L = scann.nextInt();
		int A = scann.nextInt();
		int B = scann.nextInt();
		int C = scann.nextInt();
		int D = scann.nextInt();
		
		int K = (int) Math.ceil((double)A/C);
		int M = (int) Math.ceil((double)B/D);
		
		System.out.println(Math.max(0, L-Math.max(K, M)));

	}

}
