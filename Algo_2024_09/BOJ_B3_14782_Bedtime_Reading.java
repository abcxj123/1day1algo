import java.util.Scanner;

public class BOJ_B3_14782_Bedtime_Reading {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int I = scann.nextInt();
		int ans = 0;
		
		for (int i = 1; i <= I; i++) {
			if(I % i == 0) ans += i;
		}
		
		System.out.println(ans);

	}

}
