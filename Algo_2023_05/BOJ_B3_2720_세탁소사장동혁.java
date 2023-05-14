import java.util.Scanner;

public class BOJ_B3_2720_세탁소사장동혁 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int T = scann.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int money = scann.nextInt();
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			
			while(money > 0) {
				if(money >= 25) {
					a++;
					money -= 25;
				} else if(money >= 10) {
					b++;
					money -= 10;
				} else if(money >= 5) {
					c++;
					money -= 5;
				} else {
					d++;
					money -= 1;
				}
			}
			
			System.out.println(a+" "+b+" "+c+" "+d);
			
		}

	}

}
