import java.util.Scanner;

public class BOJ_B5_5341_Pyramids {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = scann.nextInt();
			
			if(n == 0) break;
			
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			
			sb.append(sum+"\n");
			
		}
		
		if(sb.length() > 0) sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
