import java.util.Scanner;

public class BOJ_B1_1855_암호 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int M = scann.nextInt();
		String str = scann.next();
		
		int N = str.length() / M;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				int idx = -1;
				if(j % 2 == 0) {
					idx = j*M+i;
				} else {
					idx = j*M+M-1-i;
				}
				sb.append(str.charAt(idx));
			}
		}
		
		System.out.println(sb.toString());

	}

}
