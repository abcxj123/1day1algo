import java.util.Scanner;

public class BOJ_B2_1568_새 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int time = 0;
		int cnt = 1;
		
		while(true) {
			if(N < cnt) {
				cnt = 1;
			}
			N -= cnt;
			cnt++;
			time++;
			
			if(N == 0) break;
		}
		
		System.out.println(time);

	}

}
