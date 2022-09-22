import java.util.Scanner;

public class BOJ_B1_1110_더하기사이클 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int origin = N;
		int cnt = 0;
		
		do {
			if(N < 10) {
				N *= 11;
				cnt++;
			} else {
				int one = N % 10;
				int ten = N / 10;
				N = (one + ten) % 10 + one * 10;
				cnt++;
			}
			
		} while (N != origin);
		
		System.out.println(cnt);

	}

}
