import java.util.Scanner;

public class BOJ_B4_17009_WS {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

		int a = 0;
		int b = 0;
		
		a += scann.nextInt()*3;
		a += scann.nextInt()*2;
		a += scann.nextInt();
		
		b += scann.nextInt()*3;
		b += scann.nextInt()*2;
		b += scann.nextInt();
		
		if(a > b) System.out.println("A");
		else if(a < b) System.out.println("B");
		else System.out.println("T");
		
	}

}
