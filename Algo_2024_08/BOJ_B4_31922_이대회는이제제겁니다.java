import java.util.Scanner;

public class BOJ_B4_31922_이대회는이제제겁니다 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt();
		int P = scann.nextInt();
		int C = scann.nextInt();
		
		int ans = Math.max(A+C, P);
		
		System.out.println(ans);
		
	}

}
