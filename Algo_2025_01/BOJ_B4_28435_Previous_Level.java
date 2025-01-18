import java.util.Scanner;

public class BOJ_B4_28435_Previous_Level {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			
			if(n == 300) sb.append("1 ");
			else if(n >= 275) sb.append("2 ");
			else if(n >= 250) sb.append("3 ");
			else sb.append("4 ");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
