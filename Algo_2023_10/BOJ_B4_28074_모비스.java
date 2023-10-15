import java.util.Scanner;

public class BOJ_B4_28074_모비스 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.next();
		
		boolean [] arr = new boolean[5];
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'M') {
				arr[0] = true;
			} else if(c == 'O') {
				arr[1] = true;
			} else if(c == 'B') {
				arr[2] = true;
			} else if(c == 'I') {
				arr[3] = true;
			} else if(c == 'S') {
				arr[4] = true;
			}
		}
		
		boolean flag = true;
		
		for (int i = 0; i < 5; i++) {
			if(arr[i]) continue;
			
			flag = false;
			break;
		}
		
		if(flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		

	}

}
