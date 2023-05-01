import java.util.Scanner;

public class BOJ_B3_2525_오븐시계 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int hour = scann.nextInt();
		int min = scann.nextInt();
		int add = scann.nextInt();
		
		int time = (hour * 60 + min + add) % 1440;
		
		hour = time / 60;
		min = time % 60;
		
		System.out.println(hour+" "+min);

	}

}
