import java.util.Scanner;

public class BOJ_B3_11874_ZAMKA {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int L = scann.nextInt();
		int D = scann.nextInt();
		int X = scann.nextInt();
		
		int N = -1;
		
		for (int i = L; i <= D; i++) {
			String s = String.valueOf(i);
			int sum = 0;
			
			for (int j = 0; j < s.length(); j++) {
				sum += s.charAt(j) - '0';
			}
			
			if(sum == X) {
				N = i;
				break;
			}
		}
		
		int M = -1;
		
		for (int i = D; i >= N; i--) {
			String s = String.valueOf(i);
			int sum = 0;
			
			for (int j = 0; j < s.length(); j++) {
				sum += s.charAt(j) - '0';
			}
			
			if(sum == X) {
				M = i;
				break;
			}
		}
		
		System.out.println(N);
		System.out.println(M);
		
	}

}
