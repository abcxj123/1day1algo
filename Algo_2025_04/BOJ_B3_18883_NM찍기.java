import java.util.Scanner;

public class BOJ_B3_18883_NM찍기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		int M = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= M; j++) {
				sb.append((i*M+j)+" ");
			}
			sb.setLength(sb.length()-1);
			sb.append("\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
