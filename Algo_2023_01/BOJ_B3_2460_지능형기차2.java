import java.util.Scanner;

public class BOJ_B3_2460_지능형기차2 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int max = -1;
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			int out = scann.nextInt();
			int in = scann.nextInt();
			sum += in - out;
			max = Math.max(max, sum);
		}
		
		System.out.println(max);

	}

}
