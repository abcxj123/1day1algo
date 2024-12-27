import java.util.Scanner;

public class BOJ_B3_20944_팰린드롬척화비 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		if(N == 1) System.out.println('a');
		else if(N == 2) System.out.println("aa");
		else {
			StringBuilder sb = new StringBuilder();
			if(N % 2 != 0) {
				for (int i = 0; i < N/2; i++) {
					sb.append('a');
				}
				sb.append('b');
				for (int i = 0; i < N/2; i++) {
					sb.append('a');
				}
			} else {
				for (int i = 0; i < N/2-1; i++) {
					sb.append('a');
				}
				sb.append("bb");
				for (int i = 0; i < N/2-1; i++) {
					sb.append('a');
				}
			}
			System.out.println(sb.toString());
		}

	}

}
