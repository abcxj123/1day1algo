import java.util.Scanner;

public class BOJ_B3_3276_ICONS {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		outer:
			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= i; j++) {
					if(N <= i*j) {
						System.out.println(i+" "+j);
						break outer;
					}
				}
			}

	}

}
