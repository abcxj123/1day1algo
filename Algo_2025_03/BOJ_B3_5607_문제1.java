import java.util.Scanner;

public class BOJ_B3_5607_문제1 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		int N = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			int n1 = scann.nextInt();
			int n2 = scann.nextInt();
			
			if(n1 > n2) A += (n1 + n2);
			else if(n1 < n2) B += (n1 + n2);
			else {
				A += n1;
				B += n2;
			}
		}
		
		System.out.println(A+" "+B);

	}

}
