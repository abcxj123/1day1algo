import java.util.Scanner;

public class BOJ_B3_2523_별찍기13 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < i; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		
		for (int i = N-1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		
		System.out.println(sb.toString());

	}

}
