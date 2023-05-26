import java.util.Scanner;

public class BOJ_B1_1526_가장큰금민수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 0;
		
		for (int i = N; i >= 4; i--) {
			String str = String.valueOf(i);
			boolean check = true;
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if(c != '4' && c != '7') {
					check = false;
					break;
				}
			}
			if(check) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);

	}

}
