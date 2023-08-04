import java.util.Scanner;

public class BOJ_S4_1065_한수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 0;
		
		for (int i = 1; i <= N; i++) {
			if(i < 100) ans++;
			else {
				int a = i / 100;
				int b = (i / 10) % 10;
				int c = i % 10;
				if(b-a == c-b) ans++;
			}
		}
		
		System.out.println(ans);

	}

}
