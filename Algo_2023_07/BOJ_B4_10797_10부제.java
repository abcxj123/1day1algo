import java.util.Scanner;

public class BOJ_B4_10797_10부제 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < 5; i++) {
			int n = scann.nextInt();
			if(N == n) cnt++;
		}
		
		System.out.println(cnt);

	}

}
