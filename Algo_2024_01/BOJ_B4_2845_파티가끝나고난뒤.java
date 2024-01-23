import java.util.Scanner;

public class BOJ_B4_2845_파티가끝나고난뒤 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int L = scann.nextInt();
		int P = scann.nextInt();
		
		int sum = L*P;
		for (int i = 0; i < 5; i++) {
			int n = scann.nextInt();
			sb.append(n-sum).append(" ");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
