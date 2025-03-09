import java.util.Scanner;

public class BOJ_B3_30018_타슈 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int [] arr = new int[N];
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = scann.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			
			ans += Math.abs(n - arr[i]);
		}
		
		System.out.println(ans/2);

	}

}
