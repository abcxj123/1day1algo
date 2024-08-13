import java.util.Scanner;

public class BOJ_B4_13623_Zero_or_One {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int b = scann.nextInt();
		int c = scann.nextInt();
		
		if(a == b && b == c) {
			System.out.println("*");
		} else if(b == c) {
			System.out.println("A");
		} else if(a == c) {
			System.out.println("B");
		} else if(a == b) {
			System.out.println("C");
		}

	}

}
