import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B2_2578_대표값2 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int [] arr = new int[5];
		int avg = 0;
		
		for (int i = 0; i < 5; i++) {
			arr[i] = scann.nextInt();
			avg += arr[i];
		}
		
		Arrays.sort(arr);
		
		System.out.println(avg/5);
		System.out.println(arr[2]);

	}

}
