import java.util.Scanner;

public class BOJ_B3_2884_ěëěęł {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int b = scann.nextInt();
		
		int time = a * 60 + b;
		time -= 45;
		
		if(time < 0) {
			time += 24 * 60;
		}
		
		System.out.println(time/60 + " " + time%60);

	}

}
