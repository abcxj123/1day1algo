import java.util.Scanner;

public class BOJ_B5_21300_Bottle_Return {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 0; i < 6; i++) {
			sum += scann.nextInt();
		}
		
		System.out.println(sum*5);

	}

}
