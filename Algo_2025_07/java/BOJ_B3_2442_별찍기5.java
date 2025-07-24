import java.util.Scanner;

public class BOJ_B3_2442_별찍기5 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < N-i; j++) {
				sb.append(' ');
			}
			
			for (int j = 0; j < i*2-1; j++) {
				sb.append('*');
			}
			
			sb.append('\n');
		}
		
		if(sb.length() > 0) sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
