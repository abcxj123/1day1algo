import java.util.Scanner;

public class BOJ_B1_11170_0의개수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = scann.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int a = scann.nextInt();
			int b = scann.nextInt();
			int cnt = 0;
			
			for (int i = a; i <= b; i++) {
				String str = String.valueOf(i);
				for (int j = 0; j < str.length(); j++) {
					char c = str.charAt(j);
					if(c == '0') {
						cnt++;
					}
				}
			}
			
			sb.append(cnt+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
