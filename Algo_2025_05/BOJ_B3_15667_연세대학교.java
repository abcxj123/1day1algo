import java.util.Scanner;

public class BOJ_B3_15667_연세대학교 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 0;
		
		while(true) {
			if(N == (1 + ans + ans*ans)) break;
			
			ans++;
		}
		
		System.out.println(ans);

	}

}
