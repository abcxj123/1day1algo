import java.util.Scanner;

public class BOJ_B3_11966_2의제곱인가 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		boolean check = false;
		
		if(N == 1) {
			System.out.println(1);
			System.exit(0);
		}
		
		int num = 1;
		
		for (int i = 0; i < 30; i++) {
			num *= 2;
			
			if(num == N) {
				check = true;
				break;
			}
		}
		
		if(check) System.out.println(1);
		else System.out.println(0);

	}

}
