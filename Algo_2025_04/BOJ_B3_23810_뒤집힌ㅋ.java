import java.util.Scanner;

public class BOJ_B3_23810_뒤집힌ㅋ {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 5*N; j++) {
				sb.append('@');
			}
			sb.append('\n');
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append('@');
			}
			sb.append('\n');
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 5*N; j++) {
				sb.append('@');
			}
			sb.append('\n');
		}
		
		for (int i = 0; i < 2*N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append('@');
			}
			sb.append('\n');
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
