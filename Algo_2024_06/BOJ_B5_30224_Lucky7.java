import java.util.Scanner;

public class BOJ_B5_30224_Lucky7 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		String N2 = String.valueOf(N);
		
		boolean contain = false;
		for (int i = 0; i < N2.length(); i++) {
			if(N2.charAt(i) == '7') {
				contain = true;
				break;
			}
		}
		
		if(!contain && N % 7 != 0) {
			System.out.println(0);
		} else if(!contain && N % 7 == 0) {
			System.out.println(1);
		} else if(contain && N % 7 != 0) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
	}

}
