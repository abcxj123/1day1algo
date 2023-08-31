import java.util.Scanner;

public class BOJ_B4_13752_히스토그램 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			for (int j = 0; j < n; j++) {
				System.out.print("=");
			}
			System.out.println();
		}

	}

}
