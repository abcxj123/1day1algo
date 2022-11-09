import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_S4_1758_알바생강호 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		Integer [] arr = new Integer[N];
		long ans = 0;
		int idx = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = scann.nextInt();
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (int i = 0; i < N; i++) {
			int n = arr[i];
			int tmp = n - (idx++);
			if(tmp > 0) ans += tmp;
		}
		
		System.out.println(ans);

	}

}
