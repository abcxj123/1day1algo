import java.util.Scanner;

public class BOJ_B5_24568_Cupcake_Party {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int R = scann.nextInt();
		int S = scann.nextInt();
		
		int ans = R*8 + S*3;
		
		System.out.println(Math.max(ans-28, 0));

	}

}
