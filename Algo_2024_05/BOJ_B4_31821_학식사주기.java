import java.util.Scanner;

public class BOJ_B4_31821_학식사주기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		int [] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = scann.nextInt();
		}
		
		int M = scann.nextInt();
		int sum = 0;
		
		for (int i = 0; i < M; i++) {
			sum += arr[scann.nextInt()-1];
		}
		
		System.out.println(sum);

	}

}
