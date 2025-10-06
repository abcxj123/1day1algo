import java.util.Scanner;

public class BOJ_B3_23794_골뱅이찍기정사각형 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N+2; i++) {
			sb.append('@');
		}
		sb.append('\n');
		
		for (int i = 0; i < N; i++) {
			sb.append('@');
			
			for (int j = 0; j < N; j++) {
				sb.append(' ');
			}
			
			sb.append("@\n");
		}
		
		for (int i = 0; i < N+2; i++) {
			sb.append('@');
		}
		
		System.out.println(sb.toString());

	}

}
