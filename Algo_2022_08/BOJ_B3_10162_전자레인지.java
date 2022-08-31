import java.util.Scanner;

public class BOJ_B3_10162_전자레인지 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		int C = 0;
		
		int T = scann.nextInt();
		
		while (T >= 300) {
			T -= 300;
			A++;
		}
		
		while (T >= 60) {
			T -= 60;
			B++;
		}
		
		while (T >= 10) {
			T -= 10;
			C++;
		}
		
		if(T != 0) System.out.println(-1);
		else {
			StringBuilder sb = new StringBuilder();
			sb.append(A).append(" ").append(B).append(" ").append(C);
			System.out.println(sb.toString());
		}

	}

}
