import java.util.Scanner;

public class BOJ_B4_14489_치킨두마리 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt();
		int B = scann.nextInt();
		
		int chicken = scann.nextInt();
		
		if(A+B >= 2 * chicken) {
			System.out.println(A+B - 2 * chicken);
		} else {
			System.out.println(A+B);
		}

	}

}
