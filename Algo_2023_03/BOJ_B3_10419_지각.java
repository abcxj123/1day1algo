import java.util.Scanner;

public class BOJ_B3_10419_지각 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int n = scann.nextInt();
			
			int time = 0;
			for (int i = 1; i <= 99; i++) {
				if(i+i*i > n) {
					break;
				}
				time = i;
			}
			
			System.out.println(time);
		}

	}

}
