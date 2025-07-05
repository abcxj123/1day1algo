import java.util.Scanner;

public class BOJ_B5_32498_problems {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			int d = scann.nextInt();
			
			if(d % 2 != 0) ans++;
		}
		
		System.out.println(ans);

	}

}
