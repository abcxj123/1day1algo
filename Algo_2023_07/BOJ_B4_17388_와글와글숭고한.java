import java.util.Scanner;

public class BOJ_B4_17388_와글와글숭고한 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int b = scann.nextInt();
		int c = scann.nextInt();
		
		if(a+b+c >= 100) {
			System.out.println("OK");
		} else {
			int min = Math.min(a, Math.min(b, c));
			if(min == a) {
				System.out.println("Soongsil");
			} else if(min == b) {
				System.out.println("Korea");
			} else if(min == c) {
				System.out.println("Hanyang");
			}
		}

	}

}
