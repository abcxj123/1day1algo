import java.util.Scanner;

public class BOJ_B3_11648_지속 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.nextLine();
		int ans = 0;
		
		while(str.length() > 1) {
			int num = 1;
			for (int i = 0; i < str.length(); i++) {
				int n = str.charAt(i) - '0';
				num *= n;
			}
			
			str = String.valueOf(num);
			ans++;
			
		}
		
		System.out.println(ans);

	}

}
