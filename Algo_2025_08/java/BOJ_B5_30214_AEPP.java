import java.util.Scanner;

public class BOJ_B5_30214_AEPP {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int s1 = scann.nextInt();
		int s2 = scann.nextInt() - s1;
		
		if(s1 >= s2) System.out.println("E");
		else System.out.println("H");

	}

}
