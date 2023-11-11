import java.util.Scanner;

public class BOJ_B4_10768_특별한날 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int m = scann.nextInt();
		int d = scann.nextInt();
		
		if(m < 2) {
			System.out.println("Before");
		} else if(m > 2) {
			System.out.println("After");
		} else if(d < 18) {
			System.out.println("Before");
		} else if(d > 18) {
			System.out.println("After");
		} else {
			System.out.println("Special");
		}

	}

}
