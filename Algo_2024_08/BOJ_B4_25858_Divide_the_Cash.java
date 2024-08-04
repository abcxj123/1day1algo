import java.util.Scanner;

public class BOJ_B4_25858_Divide_the_Cash {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int D = scann.nextInt();

		int sum = 0;
		int [] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = scann.nextInt();
			sum += arr[i];
		}
		
		int div = D / sum;
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]*div);
		}
		
	}

}
