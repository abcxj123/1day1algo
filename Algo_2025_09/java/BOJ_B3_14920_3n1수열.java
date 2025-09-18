import java.util.Scanner;

public class BOJ_B3_14920_3n1수열 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 1;
		
		while(N > 1) {
			if(N % 2 == 0) {
				N /= 2;
			} else {
				N = (3*N)+1;
			}
			
			ans++;
		}
		
		System.out.println(ans);

	}

}
