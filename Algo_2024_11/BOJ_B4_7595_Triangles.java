import java.util.Scanner;

public class BOJ_B4_7595_Triangles {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int N = scann.nextInt();
			
			if(N == 0) break;
			
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= i; j++) {
					sb.append('*');
				}
				sb.append("\n");
			}
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
