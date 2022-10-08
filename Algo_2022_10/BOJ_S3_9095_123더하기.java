import java.util.Scanner;

public class BOJ_S3_9095_123더하기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int n = scann.nextInt();
			
			int [] arr = new int[4];
			if(n > 3) {
				arr = new int[n+1];
			} 
			
			arr[1] = 1;
			arr[2] = 2;
			arr[3] = 4;
			
			for (int i = 4; i <= n; i++) {
				arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
			}
			
			System.out.println(arr[n]);
			
		}

	}

}
