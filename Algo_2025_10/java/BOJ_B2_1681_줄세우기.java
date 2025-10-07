import java.util.Scanner;

public class BOJ_B2_1681_줄세우기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		String L = scann.next();
		
		int cnt = 0;
		int num = 1;
		
		while(cnt < N) {
			if(String.valueOf(num++).indexOf(L) == -1) {
				cnt++;
			}
		}
		
		System.out.println(num-1);

	}

}
