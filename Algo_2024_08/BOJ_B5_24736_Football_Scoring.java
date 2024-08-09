import java.util.Scanner;

public class BOJ_B5_24736_Football_Scoring {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 2; i++) {
			int a = scann.nextInt()*6;
			int b = scann.nextInt()*3;
			int c = scann.nextInt()*2;
			int d = scann.nextInt();
			int e = scann.nextInt()*2;
			
			sb.append((a+b+c+d+e)+" ");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
