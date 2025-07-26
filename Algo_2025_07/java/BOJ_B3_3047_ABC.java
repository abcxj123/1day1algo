import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B3_3047_ABC {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int [] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = scann.nextInt();
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		scann.nextLine();
		String s = scann.nextLine();
		
		for (int i = 0; i < 3; i++) {
			int idx = s.charAt(i) - 'A';
			
			sb.append(arr[idx]+" ");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
