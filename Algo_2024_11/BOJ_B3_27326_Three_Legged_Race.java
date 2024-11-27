import java.util.Scanner;

public class BOJ_B3_27326_Three_Legged_Race {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		int [] arr = new int[N+1];
		
		for (int i = 0; i < 2*N-1; i++) {
			int n = scann.nextInt();
			arr[n]++;
		}
		
		for (int i = 1; i <= N; i++) {
			if(arr[i] != 2) {
				System.out.println(i);
				break;
			}
		}

	}

}
