import java.util.Scanner;

public class BOJ_B2_10822_더하기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.next();
		String [] arr = str.split(",");
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);

	}

}
