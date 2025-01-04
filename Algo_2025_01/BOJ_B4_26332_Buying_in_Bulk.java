import java.util.Scanner;

public class BOJ_B4_26332_Buying_in_Bulk {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			int c = scann.nextInt();
			int p = scann.nextInt();
			
			System.out.println(c+" "+p);
			
			int sum = c*p;
			sum -= (c-1)*2;
			
			System.out.println(sum);
		}

	}

}
