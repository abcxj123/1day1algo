import java.util.Scanner;

public class BOJ_B5_30676_이별을무슨색일까 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		if(N >= 620) System.out.println("Red");
		else if(N >= 590) System.out.println("Orange");
		else if(N >= 570) System.out.println("Yellow");
		else if(N >= 495) System.out.println("Green");
		else if(N >= 450) System.out.println("Blue");
		else if(N >= 425) System.out.println("Indigo");
		else System.out.println("Violet");

	}

}
