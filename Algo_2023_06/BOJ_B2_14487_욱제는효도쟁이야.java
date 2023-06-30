import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B2_14487_욱제는효도쟁이야 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		int [] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = scann.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum = 0;
		for (int i = 0; i < N-1; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);

	}

}
