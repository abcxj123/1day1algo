import java.util.Scanner;

public class BOJ_B4_25625_샤틀버스 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int x = scann.nextInt();
		int y = scann.nextInt();
		
		if(x > y) System.out.println(x+y);
		else System.out.println(y-x);

	}

}
