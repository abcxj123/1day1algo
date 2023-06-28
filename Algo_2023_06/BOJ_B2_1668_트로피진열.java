import java.util.Scanner;

public class BOJ_B2_1668_트로피진열 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int [] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = scann.nextInt();
		}
		
		int left = 0;
		int right = 0;
		
		int max = 0;
		for (int i = 0; i < N; i++) {
			int n = arr[i];
			if(n > max) {
				max = n;
				left++;
			}
		}
		
		max = 0;
		for (int i = N-1; i >= 0; i--) {
			int n = arr[i];
			if(n > max) {
				max = n;
				right++;
			}
		}
		
		System.out.println(left);
		System.out.println(right);

	}

}
