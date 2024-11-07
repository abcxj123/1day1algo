import java.util.Scanner;

public class BOJ_B4_24079_Moving {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int x = scann.nextInt();
		int y = scann.nextInt();
		int z = scann.nextInt();
		
		if(x*60+y*60 <= z*60+30) System.out.println(1);
		else System.out.println(0);

	}

}
