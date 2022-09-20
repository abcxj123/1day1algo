import java.util.Scanner;

public class BOJ_B2_17608_막대기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int [] arr = new int[N];
		int max = -1;
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = scann.nextInt();
		}
		
		for (int i = N-1; i >= 0; i--) {
			if(arr[i] > max) {
				max = arr[i];
				ans++;
			}
		}
		
		System.out.println(ans);

	}

}
