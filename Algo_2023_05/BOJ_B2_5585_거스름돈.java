import java.util.Scanner;

public class BOJ_B2_5585_거스름돈 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int money = 1000 - scann.nextInt();
		int cnt = 0;
		
		while(money > 0) {
			if(money >= 500) {
				money -= 500;
			} else if(money >= 100) {
				money -= 100;
			} else if(money >= 50) {
				money -= 50;
			} else if(money >= 10) {
				money -= 10;
			} else if(money >= 5) {
				money -= 5;
			} else {
				money -= 1;
			}
			
			cnt++;
		}
		
		System.out.println(cnt);

	}

}
