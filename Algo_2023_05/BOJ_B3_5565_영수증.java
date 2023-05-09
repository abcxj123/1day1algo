import java.util.Scanner;

public class BOJ_B3_5565_영수증 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int cost = scann.nextInt();
		
		for (int i = 0; i < 9; i++) {
			cost -= scann.nextInt();
		}
		
		System.out.println(cost);

	}

}
