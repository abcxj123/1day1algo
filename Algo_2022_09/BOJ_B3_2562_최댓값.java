import java.util.Scanner;

public class BOJ_B3_2562_최댓값 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int [] arr = new int[9];
		int max = -1;
		int idx = -1;
		
		for (int i = 0; i < 9; i++) {
			arr[i] = scann.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				idx = i;
			}
		}
		
		System.out.println(max);
		System.out.println(idx+1);

	}

}
