import java.util.Scanner;

public class BOJ_B5_7891_Can_you_add_this. {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = scann.nextInt();
		
		for (int t = 0; t < T; t++) {
			int a = scann.nextInt();
			int b = scann.nextInt();
			
			sb.append(a+b).append('\n');
		}
		
		if(sb.length()>0) {
			sb.setLength(sb.length()-1);
		}
		
		System.out.println(sb.toString());

	}

}
