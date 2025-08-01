import java.util.Scanner;

public class BOJ_B3_2445_별찍기8 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < i; j++) {
				sb.append('*');
			}
			
			for (int j = 0; j < (N-i)*2; j++) {
				sb.append(' ');
			}
			
			for (int j = 0; j < i; j++) {
				sb.append('*');
			}
			
			sb.append('\n');
			
		}
		
		for (int i = N-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				sb.append('*');
			}
			
			for (int j = 0; j < (N-i)*2; j++) {
				sb.append(' ');
			}
			
			for (int j = 0; j < i; j++) {
				sb.append('*');
			}
			
			sb.append('\n');
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
