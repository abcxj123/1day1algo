import java.util.Scanner;

public class BOJ_B4_29766_DKSH찾기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.nextLine();
		
		boolean D = false;
		boolean K = false;
		boolean S = false;
		
		int ans = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'D') {
				D = true;
				K = false;
				S = false;
			} else if(D && c == 'K') {
				D = false;
				K = true;
				S = false;
			} else if(K && c == 'S') {
				D = false;
				K = false;
				S = true;
			} else if(S && c == 'H') {
				D = false;
				K = false;
				S = false;
				ans++;
			} else {
				D = false;
				K = false;
				S = false;
			}
		}
		
		System.out.println(ans);

	}

}
