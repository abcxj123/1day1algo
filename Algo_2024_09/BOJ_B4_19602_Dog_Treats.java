import java.util.Scanner;

public class BOJ_B4_19602_Dog_Treats {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int b = scann.nextInt();
		int c = scann.nextInt();
		
		int sum = 1*a + 2*b + 3*c;
		
		if(sum >= 10) {
			System.out.println("happy");
		} else {
			System.out.println("sad");
		}

	}

}
