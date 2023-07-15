import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B1_2204_도비의난독증테스트 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int N = scann.nextInt();
			
			if(N == 0) break;
			
			String ans = scann.next();
			String past = ans.toLowerCase();
			
			for (int i = 1; i < N; i++) {
				String origin = scann.next();
				String str = origin.toLowerCase();
				if(str.compareTo(past) < 0) {
					ans = origin;
					past = str;
				}
			}
			
			sb.append(ans+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
