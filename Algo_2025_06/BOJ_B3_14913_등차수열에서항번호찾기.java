import java.util.Scanner;

public class BOJ_B3_14913_등차수열에서항번호찾기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int d = scann.nextInt();
		int k = scann.nextInt();
		
		if((k-a) % d == 0 && (k-a)/d >= 0) {
			System.out.println(((k-a)/d)+1);
		} else {
			System.out.println("X");
		}

	}

}
