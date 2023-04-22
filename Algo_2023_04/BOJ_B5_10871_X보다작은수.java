import java.util.Scanner;

public class BOJ_B5_10871_X보다작은수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		int X = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			if(n < X) {
				sb.append(n).append(" ");
			}
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
