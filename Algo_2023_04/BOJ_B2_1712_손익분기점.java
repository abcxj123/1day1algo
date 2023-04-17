import java.util.Scanner;

public class BOJ_B2_1712_손익분기점 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt();
		int B = scann.nextInt();
		int C = scann.nextInt();
		
		if(B >= C) {
			System.out.println(-1);
		} else {
			int diff = C - B;
			int tmp = A / diff;
			System.out.println(tmp+1);
		}

	}

}
