import java.util.Scanner;

public class BOJ_B4_6810_ISBN {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int b = scann.nextInt();
		int c = scann.nextInt();
		
		int ans = 91+a+b*3+c;
		
		System.out.println("The 1-3-sum is "+ans);

	}

}
