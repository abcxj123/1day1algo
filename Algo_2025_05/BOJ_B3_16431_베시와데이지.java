import java.util.Scanner;

public class BOJ_B3_16431_베시와데이지 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int b1 = scann.nextInt();
		int b2 = scann.nextInt();
		int d1 = scann.nextInt();
		int d2 = scann.nextInt();
		int j1 = scann.nextInt();
		int j2 = scann.nextInt();

		int b = Math.max(Math.abs(b1-j1), Math.abs(b2-j2));
		int d = Math.abs(d1-j1) + Math.abs(d2-j2);
		
		if(b < d) System.out.println("bessie");
		else if(b > d) System.out.println("daisy");
		else System.out.println("tie");
		
	}

}
