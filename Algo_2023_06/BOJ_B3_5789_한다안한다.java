import java.util.Scanner;

public class BOJ_B3_5789_한다안한다 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = scann.nextInt();
		
		for (int t = 1; t <= T; t++) {
			String str = scann.next();
			int mid = str.length()/2;
			char c1 = str.charAt(mid-1);
			char c2 = str.charAt(mid);
			if(c1 == c2) {
				sb.append("Do-it").append("\n");
			} else {
				sb.append("Do-it-Not").append("\n");
			}
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
