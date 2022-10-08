import java.util.Scanner;

public class BOJ_S3_11726_2xn타일링 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int n = scann.nextInt();
		
		if(n == 1) System.out.println(1);
		else {
			int [] arr = new int[n+1];
			arr[1] = 1;
			arr[2] = 2;
			
			for (int i = 3; i <= n; i++) {
				arr[i] = (arr[i-1]+arr[i-2]) % 10007;
			}
			
			System.out.println(arr[n]);
		}

	}

}
