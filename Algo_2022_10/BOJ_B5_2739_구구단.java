import java.util.Scanner;

public class BOJ_B5_2739_구구단 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(N).append(" * ").append(i).append(" = ").append(N*i);
			System.out.println(sb.toString());
		}

	}

}
