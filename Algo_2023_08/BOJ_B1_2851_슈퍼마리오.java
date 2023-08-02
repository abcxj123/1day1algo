import java.util.Scanner;

public class BOJ_B1_2851_슈퍼마리오 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int [] arr = new int[11];
		int num = 0;
		
		for (int i = 1; i <= 10; i++) {
			arr[i] = arr[i-1] + scann.nextInt();
			if(Math.abs(arr[i]-100) <= Math.abs(num-100)) {
				num = arr[i];
			} else if(arr[i] > 100) {
				break;
			}
		}
		
		System.out.println(num);

	}

}
