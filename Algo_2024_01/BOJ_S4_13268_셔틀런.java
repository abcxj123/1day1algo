import java.util.Scanner;

public class BOJ_S4_13268_셔틀런 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		N %= 100;
		
		int ans = -1;
		
		if(N == 0 || N == 10 || N == 30 || N == 60 || N == 100) {
			ans = 0;
		// 첫 번째 콘
		} else if(N < 10) {
			ans = 1;
		// 두 번째 콘 11:1 14:1 15:1 16:2 20:2 / 24:2 25:1 26:1
		} else if(N < 30) {
			N -= 10;
			if(N >= 10) {
				N = 20-N;
			}
			N--;
			ans = N/5+1;
		// 세 번째 콘
		} else if(N < 60) {
			N -= 30;
			if(N >= 15) {
				N = 30-N;
			}
			N--;
			ans = N/5+1;
		// 네 번째 콘
		} else if(N < 100) {
			N -= 60;
			if(N >= 20) {
				N = 40-N;
			}
			N--;
			ans = N/5+1;
		}
		
		System.out.println(ans);

	}

}
