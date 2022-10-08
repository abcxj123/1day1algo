import java.util.Scanner;

public class BOJ_S3_1003_피보나치함수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		
		for (int t = 1; t <= T; t++) {
			StringBuilder sb = new StringBuilder();
			int n = scann.nextInt();
			if(n == 0) {
				System.out.println("1 0");
			} else if(n == 1) {
				System.out.println("0 1");
			} else {
				int [][] arr = new int[n+1][2];
				arr[0] = new int[] {1, 0};
				arr[1] = new int[] {0, 1};
				for (int i = 2; i <= n ; i++) {
					arr[i][0] = arr[i-1][0] + arr[i-2][0];
					arr[i][1] = arr[i-1][1] + arr[i-2][1];
				}
				
				System.out.println(arr[n][0]+" "+arr[n][1]);
			}
			
		}

	}

}
