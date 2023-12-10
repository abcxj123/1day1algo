import java.util.Scanner;

public class BOJ_B5_4101_크냐 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		while(true) {
			int a = scann.nextInt();
			int b = scann.nextInt();
			
			if(a == 0 && b == 0) break;
			
			if(a > b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
