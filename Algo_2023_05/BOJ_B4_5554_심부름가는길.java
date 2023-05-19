import java.util.Scanner;

public class BOJ_B4_5554_심부름가는길 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += scann.nextInt();
		}
		
		System.out.println(sum / 60);
		System.out.println(sum % 60);
	}

}
