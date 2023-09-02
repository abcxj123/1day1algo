import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B4_2752_세수정렬 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int [] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = scann.nextInt();
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < 3; i++) {
			sb.append(arr[i]+" ");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
