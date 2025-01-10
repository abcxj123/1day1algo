import java.util.Scanner;

public class BOJ_B5_32314_Christmas_Tree_Adapter {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		scann.nextLine();
		
		int w = scann.nextInt();
		int v = scann.nextInt();
		
		if(a <= w/v) System.out.println(1);
		else System.out.println(0);

	}

}
