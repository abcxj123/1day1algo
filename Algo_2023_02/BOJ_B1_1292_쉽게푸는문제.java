import java.util.Scanner;

public class BOJ_B1_1292_쉽게푸는문제 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int time = 0;
		int cnt = 0;
		int sum = 0;
		int num = 1;
		int A = scann.nextInt();
		int B = scann.nextInt();
		
		while(time < B) {
			if(++time >= A) {
				sum += num;
			}
			if(++cnt == num) {
				num++;
				cnt = 0;
			}
		}
		
		System.out.println(sum);

	}

}
