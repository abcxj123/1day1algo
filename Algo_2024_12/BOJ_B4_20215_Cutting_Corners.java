import java.util.Scanner;

public class BOJ_B4_20215_Cutting_Corners {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int w = scann.nextInt();
		int h = scann.nextInt();
		double d = Math.sqrt(w*w+h*h);
		
		System.out.println(h+w-d);

	}

}
