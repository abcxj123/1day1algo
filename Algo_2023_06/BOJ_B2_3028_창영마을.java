import java.util.Scanner;

public class BOJ_B2_3028_창영마을 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int [] arr = new int[4];
		
		arr[1] = 1;
		
		String str = scann.next();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'A') {
				int tmp = arr[1];
				arr[1] = arr[2];
				arr[2] = tmp;
			} else if(c == 'B') {
				int tmp = arr[2];
				arr[2] = arr[3];
				arr[3] = tmp;
			} else if(c == 'C') {
				int tmp = arr[1];
				arr[1] = arr[3];
				arr[3] = tmp;
			}
		}
		
		for (int i = 1; i <= 3; i++) {
			if(arr[i] == 1) {
				System.out.println(i);
				break;
			}
		}
	}

}
