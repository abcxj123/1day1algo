import java.util.Scanner;

public class BOJ_B4_32288_바코드닉네임 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		scann.nextLine();
		String str = scann.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			char c = str.charAt(i);
			
			if(c == 'I') sb.append('i');
			else sb.append('L');
		}
		
		System.out.println(sb.toString());

	}

}
