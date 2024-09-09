import java.util.Scanner;

public class BOJ_B5_26307_Correct {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int h = scann.nextInt();
		int m = scann.nextInt();
		
		int t = h*60 + m;
		System.out.println(t - 9*60);

	}

}
