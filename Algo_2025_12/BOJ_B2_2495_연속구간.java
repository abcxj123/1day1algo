import java.util.Scanner;

public class BOJ_B2_2495_연속구간 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String str = sc.next();

			int ans = 1;
			char c = str.charAt(0);
			int temp = 1;
			
			for(int j = 1; j < str.length(); j++) {
				if(str.charAt(j) == c) temp++;
				else { 
					c = str.charAt(j);
					temp = 1;
				}

				ans = Math.max(ans, temp);
			}
			
			System.out.println(ans);

		}
	}
}
