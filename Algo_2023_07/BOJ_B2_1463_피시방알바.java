import java.util.Scanner;

public class BOJ_B2_1463_피시방알바 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 0;
		
		boolean [] arr = new boolean[101];
		
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			if(arr[n]) ans++;
			else arr[n] = true;
		}
		
		System.out.println(ans);
		

	}

}
