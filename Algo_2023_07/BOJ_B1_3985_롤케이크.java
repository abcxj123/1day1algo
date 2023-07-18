import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B1_3985_롤케이크 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int L = scann.nextInt();
		int N = scann.nextInt();
		int [] cake = new int[L+1];
		Arrays.fill(cake, 1);
		
		int exNum = 0;
		int expect = 0;
		int num = 0;
		int max = 0;
		
		for (int i = 1; i <= N; i++) {
			int P = scann.nextInt();
			int K = scann.nextInt();
			
			if(K-P > expect) {
				expect = K-P;
				exNum = i;
			}
			
			int cnt = 0;
			
			for (int j = P; j <= K; j++) {
				if(cake[j] != 0) {
					cnt++;
					cake[j] = 0;
				}
			}
			
			if(cnt > max) {
				num = i;
				max = cnt;
			}
		}
		
		System.out.println(exNum);
		System.out.println(num);
		
	}

}
