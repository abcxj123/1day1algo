import java.util.Scanner;

public class BOJ_B5_31611_Tuesday {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int X = scann.nextInt();
		
		if(X % 7 == 2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
