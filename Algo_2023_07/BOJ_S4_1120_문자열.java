import java.util.Scanner;

public class BOJ_S4_1120_문자열 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str1 = scann.next();
		String str2 = scann.next();
		
		int l1 = str1.length();
		int l2 = str2.length();
		int diff = l2 - l1;
		int min = 51;
		
		if(l1 == l2) {
			min = check(str1, str2);
		} else {
			for (int i = 0; i <= diff; i++) {
				String prefix = str2.substring(0, i);
				String suffix = str2.substring(l2-(diff-i), l2);
				
				StringBuilder sb = new StringBuilder();
				sb.append(prefix).append(str1).append(suffix);
				
				int cnt = check(sb.toString(), str2);
				
				min = Math.min(cnt, min);
				
			}
		}
		
		System.out.println(min);
		

	}

	private static int check(String str1, String str2) {
		int cnt = 0;
		
		for (int j = 0; j < str1.length(); j++) {
			char c1 = str1.charAt(j);
			char c2 = str2.charAt(j);
			if(c1 != c2) cnt++;
		}
		
		return cnt;
	}

}
