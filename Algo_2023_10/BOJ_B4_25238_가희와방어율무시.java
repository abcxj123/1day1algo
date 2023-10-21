import java.util.Scanner;

public class BOJ_B4_25238_가희와방어율무시 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		Double a = scann.nextDouble();
		int b = scann.nextInt();
		
		if((a * (100 - b) / 100) >= 100) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}

	}

}
