import java.util.Scanner;

public class BOJ_B4_11549_Tea {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		int ans = 0;
		
		for (int i = 0; i < 5; i++) {
			int n = scann.nextInt();
			if(T == n) ans++;
		}
		
		System.out.println(ans);

	}

}
