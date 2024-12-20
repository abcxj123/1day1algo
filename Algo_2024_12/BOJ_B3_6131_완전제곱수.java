import java.util.Scanner;

public class BOJ_B3_6131_완전제곱수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 0;
		
		for (int i = 1; i <= 500; i++) {
			for (int j = 1; j*j+N <= i*i; j++) {
				if(j*j+N == i*i) {
					ans++;
        }	
			}
		}
		
		System.out.println(ans);

	}

}
