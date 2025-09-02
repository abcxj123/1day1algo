import java.util.Scanner;

public class BOJ_B4_4589_GS {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		System.out.println("Gnomes:");
		
		for (int i = 0; i < N; i++) {
			int n1 = scann.nextInt();
			int n2 = scann.nextInt();
			int n3 = scann.nextInt();
			
			if((n1 <= n2 && n2 <= n3) || (n1 >= n2 && n2 >= n3)) {
				System.out.println("Ordered");
			} else {
				System.out.println("Unordered");
			}
			
		}

	}

}
