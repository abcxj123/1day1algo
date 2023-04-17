import java.util.Scanner;

public class BOJ_B1_2869_달팽이는올라가고싶다 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt();
		int B = scann.nextInt();
		int V = scann.nextInt();
		
		int diff = A - B;
		int diff2 = V - B;
		
		if(diff2 % diff == 0) {
			System.out.println(diff2 / diff);
		} else {
			System.out.println(diff2 / diff + 1);
		}
		
	}

}
