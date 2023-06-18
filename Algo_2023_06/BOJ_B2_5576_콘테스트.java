import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_B2_5576_콘테스트 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		Integer [] arr1 = new Integer[10];
		Integer [] arr2 = new Integer[10];
		
		for (int i = 0; i < 10; i++) {
			arr1[i] = scann.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			arr2[i] = scann.nextInt();
		}
		
		int sum1 = 0;
		int sum2 = 0;
		
		Arrays.sort(arr1, Collections.reverseOrder());
		Arrays.sort(arr2, Collections.reverseOrder());
		
		for (int i = 0; i < 3; i++) {
			sum1 += arr1[i];
			sum2 += arr2[i];
		}
		
		System.out.println(sum1+" "+sum2);
		
		

	}

}
