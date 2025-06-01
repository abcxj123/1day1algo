import java.util.Scanner;

public class BOJ_B3_9713_SumOfOdd {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		int [] arr = new int[T];
		int max = 1;
		
		for (int i = 0; i < T; i++) {
			arr[i] = scann.nextInt();
			max = Math.max(max, arr[i]);
		}
		
		int [] sum = new int[max+1];
		sum[1] = 1;
		
		for (int i = 3; i <= max; i++) {
			sum[i] = sum[i-2] + i;
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println(sum[arr[i]]);
		}

	}

}
