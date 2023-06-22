import java.util.Scanner;

public class BOJ_B4_11943_파일옮기기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt();
		int B = scann.nextInt();
		int C = scann.nextInt();
		int D = scann.nextInt();
		
		System.out.println(Math.min(A+D, B+C));

	}

}
