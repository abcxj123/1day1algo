import java.util.Scanner;

public class BOJ_B3_17614_369 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int cnt = 0;
		
		for (int i = 1; i <= N; i++) {
			String num = String.valueOf(i);
			for (int j = 0; j < num.length(); j++) {
				char c = num.charAt(j);
				if(c == '3' || c == '6' || c == '9') {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);

	}

}
