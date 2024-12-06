import java.util.Scanner;

public class BOJ_B3_32305_Farmers_Market {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int M = scann.nextInt();
		int d = scann.nextInt();
		
		int x = (N*M)/12;
		if((N*M)%12 != 0) x++;
		
		System.out.println(x*d);

	}

}
