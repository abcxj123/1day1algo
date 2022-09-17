import java.util.Scanner;

public class BOJ_B4_상근날드 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int burger = 2000;
		int drink = 2000;
		
		
		for (int i = 0; i < 3; i++) {
			int n = scann.nextInt();
			burger = Math.min(burger, n);
		}
		
		for (int i = 0; i < 2; i++) {
			int n = scann.nextInt();
			drink = Math.min(drink, n);
		}
		
		System.out.println(burger+drink-50);

	}

}
