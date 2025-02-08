import java.util.Scanner;

public class BOJ_B3_23806_골뱅이찍기ㅁ {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append("@@@@@");
			}
			sb.append("\n");
		}
		
		for (int i = 0; i < 3*N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append('@');
			}
			
			for (int j = 0; j < N; j++) {
				sb.append("   ");
			}
			
			for (int j = 0; j < N; j++) {
				sb.append('@');
			}
			
			sb.append("\n");
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append("@@@@@");
			}
			sb.append("\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
