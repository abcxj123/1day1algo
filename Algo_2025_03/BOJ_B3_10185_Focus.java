import java.util.Scanner;

public class BOJ_B3_10185_Focus {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = scann.nextInt();
		
		for (int t = 0; t < T; t++) {
			int p = scann.nextInt();
			int q = scann.nextInt();
			
			double f = (p*q) / (p * 1.0 + q);
			
			sb.append(String.format("f = %.1f\n", f));
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
