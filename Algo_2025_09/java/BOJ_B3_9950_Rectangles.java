import java.util.Scanner;

public class BOJ_B3_9950_Rectangles {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		while(true) {
			int a = scann.nextInt();
			int b = scann.nextInt();
			int c = scann.nextInt();
			
			if(a == 0 && b == 0 && c == 0) break;
			
			if(a == 0) {
				a = c/b;
			} else if(b == 0) {
				b = c/a;
			} else {
				c = a*b;
			}
			
			System.out.println(a+" "+b+" "+c);
			
		}

	}

}
