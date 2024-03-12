import java.util.Scanner;

public class BOJ_B2_18406_럭키스트레이트 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.next();
		
		int length = str.length();
		
		int left = 0;
		int right = 0;
		
		for (int i = 0; i < length; i++) {
			int n = str.charAt(i) - '0';
			if(i < length / 2) left += n;
			else right += n;
		}
		
		if(left == right) {
			System.out.println("LUCKY");
		} else {
			System.out.println("READY");
		}

	}

}
