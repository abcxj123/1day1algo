import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B4_11948_과목선택 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int sum = 0;
		int [] arr = new int[4];
		
		for (int i = 0; i < 4; i++) {
			arr[i] = scann.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		sum -= arr[0];
		
		sum += Math.max(scann.nextInt(), scann.nextInt());
		
		System.out.println(sum);

	}

}
