import java.util.Scanner;

public class BOJ_B4_32025_체육은수학과목입니다 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

		int H = scann.nextInt();
		int W = scann.nextInt();
		int min = Math.min(H, W)*100;
		
		System.out.println(min/2);
		
	}

}
