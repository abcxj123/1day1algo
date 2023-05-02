import java.util.Scanner;

public class BOJ_B3_2455_지능형기차 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int max = 0;
		int people = 0;
		
		for (int i = 0; i < 4; i++) {
			int out = scann.nextInt();
			int in = scann.nextInt();
			people += (in - out);
			max = Math.max(max, people);
		}
		
		System.out.println(max);

	}

}
