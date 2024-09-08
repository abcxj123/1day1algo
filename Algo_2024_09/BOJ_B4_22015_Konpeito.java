import java.util.Scanner;

public class BOJ_B4_22015_Konpeito {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int b = scann.nextInt();
		int c = scann.nextInt();
		
		int max = Math.max(a, Math.max(b, c));
		
		int sum = (max - a) + (max - b) + (max - c);
		
		System.out.println(sum);

	}

}
