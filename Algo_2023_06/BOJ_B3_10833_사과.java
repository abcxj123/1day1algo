import java.util.Scanner;

public class BOJ_B3_10833_사과 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			int student = scann.nextInt();
			int total = scann.nextInt();
			
			ans += (total % student);
			
		}
		
		System.out.println(ans);

	}

}
