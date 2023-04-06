import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B3_2997_네번째수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int [] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = scann.nextInt();
		}
		
		Arrays.sort(arr);
		
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		
		int diff1 = b - a;
		int diff2 = c - b;
		
		if(diff1 > diff2) {
			System.out.println(a+diff2);
		} else if(diff1 < diff2) {
			System.out.println(b+diff1);
		} else if(diff1 == diff2) {
			System.out.println(c+diff1);
		}

	}

}
