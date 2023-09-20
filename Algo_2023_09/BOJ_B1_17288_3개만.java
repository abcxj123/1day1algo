import java.util.Scanner;

public class BOJ_B1_17288_3개만 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int ans = 0;
		int cnt = 0;
		String str = scann.next();
		int past = -2;
		
		for (int i = 0; i < str.length(); i++) {
			int n = str.charAt(i) - '0';
			if(past + 1 == n) {
				cnt++;
			} else {
				if(cnt == 2) {
					ans++;
				}
				cnt = 0;
			}
			past = n;
		}
		
		if(cnt == 2) ans++;
		
		System.out.println(ans);

	}

}
