import java.util.Scanner;

public class BOJ_S5_1094_막대기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 0;
		
		for (int i = 0; i <= 6; i++) {
			if((N & (1 << i)) != 0) ans++;
		}
		
		System.out.println(ans);

	}

}
