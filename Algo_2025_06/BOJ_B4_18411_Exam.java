import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B4_18411_Exam {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int [] arr = new int[3];
		
		arr[0] = scann.nextInt();
		arr[1] = scann.nextInt();
		arr[2] = scann.nextInt();

		Arrays.sort(arr);
		
		System.out.println(arr[1]+arr[2]);
		
	}

}
