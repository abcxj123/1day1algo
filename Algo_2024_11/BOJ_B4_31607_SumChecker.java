import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B4_31607_SumChecker {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int [] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = scann.nextInt();
		}
		
		Arrays.sort(arr);
		
		if(arr[0] + arr[1] == arr[2]) System.out.println(1);
		else System.out.println(0);

	}

}
