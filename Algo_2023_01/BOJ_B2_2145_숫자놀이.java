import java.util.Scanner;

public class BOJ_B2_2145_숫자놀이 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		while(true) {
			int N = scann.nextInt();
			
			if(N == 0) {
				break;
			}
			
			int sum = 0;
			
			while(true) {
				while(N > 0) {
					sum += N % 10;
					N /= 10;
				}
				if(sum < 10) break;
				N = sum;
				sum = 0;
			}
			
			System.out.println(sum);
			
		}

	}

}
