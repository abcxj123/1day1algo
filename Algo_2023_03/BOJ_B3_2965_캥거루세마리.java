import java.util.Scanner;

public class BOJ_B3_2965_캥거루세마리 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt();
		int B = scann.nextInt();
		int C = scann.nextInt();
		
		int dist1 = B-A-1;
		int dist2 = C-B-1;
		
		System.out.println(Math.max(dist1, dist2));
	}

}
