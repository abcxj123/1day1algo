import java.util.Scanner;

public class BOJ_B2_10801_카드게임 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int Awin = 0;
		int Bwin = 0;
		int [] A = new int[10];
		int [] B = new int[10];
		
		for (int i = 0; i < 10; i++) {
			A[i] = scann.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			B[i] = scann.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			if(A[i] > B[i]) Awin++;
			else if(A[i] < B[i]) Bwin++;
		}
		
		if(Awin > Bwin) {
			System.out.println("A");
		} else if(Awin < Bwin) {
			System.out.println("B");
		} else {
			System.out.println("D");
		}

	}

}
