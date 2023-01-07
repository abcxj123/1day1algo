import java.util.Scanner;

public class BOJ_B2_1075_나누기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt() / 100 * 100;
		int F = scann.nextInt();
		
		for (int i = 0; i <= 99; i++) {
			int n = N + i;
			if(n % F == 0) {
				if(i <= 9) {
					System.out.println("0"+i);
				} else {
					System.out.println(i);
				}
				System.exit(0);
			}
		}

	}

}
