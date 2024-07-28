import java.util.Scanner;

public class BOJ_B5_26574_Copier {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			sb.append(n+" "+n+"\n");
		}
		
		if(sb.length() > 0) {
			sb.setLength(sb.length()-1);
		}
		System.out.println(sb.toString());

	}

}
