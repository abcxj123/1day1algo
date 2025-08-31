import java.util.Scanner;

public class BOJ_B4_6763_Sfanf {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int limit = scann.nextInt();
		int speed = scann.nextInt();
		int diff = speed - limit;
		
		if(diff <= 0) System.out.println("Congratulations, you are within the speed limit!");
		else {
			int fee = 500;
			
			if(diff <= 20) {
				fee = 100;
			} else if(diff <= 30) {
				fee = 270;
			}
			
			System.out.println("You are speeding and your fine is $"+fee+".");
		}

	}

}
