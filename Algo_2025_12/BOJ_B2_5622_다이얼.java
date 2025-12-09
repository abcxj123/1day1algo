import java.util.Scanner;

public class BOJ_B2_5622_다이얼 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String s = scann.nextLine();
		int ans = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			int n = c - 'A';
			
			if(c == 'Z') {
				ans += 7;
				continue;
			} else if(c >= 'Q') n--;
			
			ans += n / 3;
		}
		
		ans += 3 * s.length();
		
		System.out.println(ans);

	}

}
