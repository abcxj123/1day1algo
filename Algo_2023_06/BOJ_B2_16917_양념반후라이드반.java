import java.util.Scanner;

public class BOJ_B2_16917_양념반후라이드반 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt();
		int B = scann.nextInt();
		int C = scann.nextInt();
		int X = scann.nextInt();
		int Y = scann.nextInt();
		long res = 0;
		
		if(C*2 < A + B) {
			int mix = Math.min(X, Y);
			res += C * mix * 2;
			X -= mix;
			Y -= mix;
		}
		
		if(C*2 < A) {
			res += C*2*X;
		} else {
			res += A*X;
		}
		
		if(C*2 < B) {
			res += C*2*Y;
		} else {
			res += B*Y;
		}
		
		System.out.println(res);

	}

}
