import java.util.Scanner;

public class BOJ_B2_10813_공바꾸기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int M = scann.nextInt();
		
		int [] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		for (int i = 0; i < M; i++) {
			int a = scann.nextInt()-1;
			int b = scann.nextInt()-1;
			
			int tmp = arr[a];
			arr[a] = arr[b];
			arr[b] = tmp;
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
