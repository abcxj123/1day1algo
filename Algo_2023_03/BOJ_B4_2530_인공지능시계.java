import java.util.Scanner;

public class BOJ_B4_2530_인공지능시계 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int h = scann.nextInt();
		int m = scann.nextInt();
		int s = scann.nextInt();

		int add = scann.nextInt();
		
		int time = (h * 60 * 60 + m * 60 + s + add) % (24*60*60);
		
		h = time / (60*60);
		time %= (60*60);
		
		m = time / 60;
		time %= 60;
		
		System.out.println(h+" "+m+" "+time);
	}

}
