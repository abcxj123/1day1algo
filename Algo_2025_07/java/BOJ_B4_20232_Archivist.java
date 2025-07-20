import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B4_20232_Archivist {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String [] arr = new String[25];
		
		Arrays.fill(arr, "ITMO");
		
		arr[1] = "SPbSU";
		arr[2] = "SPbSU";
		arr[5] = "SPbSU";
		arr[11] = "PetrSU, ITMO";
		arr[12] = "SPbSU";
		arr[13] = "SPbSU";
		arr[18] = "SPbSU";
		arr[23] = "SPbSU";
		
		int N = scann.nextInt() - 1995;

		System.out.println(arr[N]);
		
		
	}

}
