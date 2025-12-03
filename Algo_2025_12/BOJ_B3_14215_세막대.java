import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B3_14215_세막대 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int [] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = scann.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum = arr[0] + arr[1];
		int max = Math.min(arr[2], sum-1);
		
		System.out.println(max+sum);

	}

}
