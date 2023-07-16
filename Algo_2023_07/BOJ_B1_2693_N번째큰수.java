import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B1_2693_N번째큰수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int [] arr = new int[10];
			
			for (int i = 0; i < 10; i++) {
				arr[i] = scann.nextInt();
			}
			
			Arrays.sort(arr);
			
			System.out.println(arr[7]);
		}

	}

}
