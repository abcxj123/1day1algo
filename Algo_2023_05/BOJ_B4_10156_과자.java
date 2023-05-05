import java.util.Scanner;

public class BOJ_B4_10156_과자 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int K = scann.nextInt();
		int N = scann.nextInt();
		int M = scann.nextInt();
		
		int res = K*N-M;
		if(res > 0) {
			System.out.println(res);
		} else {
			System.out.println(0);
		}

	}

}
