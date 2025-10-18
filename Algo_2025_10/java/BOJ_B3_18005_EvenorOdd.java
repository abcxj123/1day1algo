import java.util.Scanner;

public class BOJ_B3_18005_EvenorOdd {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		if(N % 2 == 1) System.out.println(0);
		else if((N/2) % 2 == 1) System.out.println(1);
		else System.out.println(2);

	}

}
