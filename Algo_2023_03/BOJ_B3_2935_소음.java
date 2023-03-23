import java.util.Scanner;

public class BOJ_B3_2935_소음 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String num1 = scann.next();
		String oper = scann.next();
		String num2 = scann.next();
		
		int leng1 = num1.length()-1;
		int leng2 = num2.length()-1;
		
		if(oper.equals("*")) {
			sb.append(1);
			int sum = leng1 + leng2;
			for (int i = 0; i < sum; i++) {
				sb.append(0);
			}
		} else {
			if(leng1 == leng2) {
				sb.append(2);
				for (int i = 0; i < leng1; i++) {
					sb.append(0);
				}
			} else {
				sb.append(1);
				int bigger = Math.max(leng1, leng2);
				int smaller = Math.min(leng1, leng2);
				for (int i = 0; i < bigger - smaller - 1; i++) {
					sb.append(0);
				}
				sb.append(1);
				for (int i = bigger - smaller; i < bigger; i++) {
					sb.append(0);
				}
			}
			
		}
		
		System.out.println(sb.toString());

	}

}
