import java.util.Scanner;

public class BOJ_B2_1173_운동 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int min = scann.nextInt();
		int max = scann.nextInt();
		int T = scann.nextInt();
		int R = scann.nextInt();
		
		int cnt = 0;
		int time = 0;
		int now = min;
		
		if(min + T > max) {
			System.out.println(-1);
		} else {
			while(true) {
				if(now + T <= max) {
					now += T;
					cnt++;
				} else {
					now -= R;
				}
				time++;
				
				if(cnt >= N) break;
				
				if(now < min) {
					now = min;
				}
			}
			
			System.out.println(time);

		}
		
	}

}
