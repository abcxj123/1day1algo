import java.util.Scanner;

public class BOJ_B4_29986_APA {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int H = scann.nextInt();
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			int A = scann.nextInt();
			
			if(A <= H) ans++;
		}
		
		System.out.println(ans);

	}

}
