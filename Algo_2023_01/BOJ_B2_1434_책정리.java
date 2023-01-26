import java.util.Scanner;

public class BOJ_B2_1434_책정리 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int M = scann.nextInt();
		
		int [] arr = new int[N];
		
		int now = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = scann.nextInt();
		}
		
		for (int i = 0; i < M; i++) {
			int book = scann.nextInt();
			for (int j = now; j < N; j++) {
				int box = arr[j];
				if(box < book) {
					now++;
				} else {
					arr[j] = box-book;
					break;
				}
			}
		}
		
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			ans += arr[i];
		}
	
		System.out.println(ans);
	}
}
