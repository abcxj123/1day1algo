import java.util.Scanner;

public class BOJ_B5_14681_사분면고르기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int x = scann.nextInt();
		int y = scann.nextInt();
		
		if(x > 0 && y > 0) System.out.println(1);
		else if(x < 0 && y > 0) System.out.println(2);
		else if(x < 0 && y < 0) System.out.println(3);
		else System.out.println(4);
	}

}
