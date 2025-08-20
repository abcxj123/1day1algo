import java.util.Scanner;

public class BOJ_B3_17174_전체계산횟수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int M = scann.nextInt();
		int ans = N;
		
		while(N >= M) {
			ans += N/M;
			N /= M;
		}
		
		System.out.println(ans);

	}

}
