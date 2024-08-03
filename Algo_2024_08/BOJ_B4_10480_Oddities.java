import java.util.Scanner;

public class BOJ_B4_10480_Oddities {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			if(n % 2 == 0) {
				sb.append(n+" is even\n");
			} else {
				sb.append(n+" is odd\n");
			}
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
