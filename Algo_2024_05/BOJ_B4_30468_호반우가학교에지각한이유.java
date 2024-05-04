import java.util.Scanner;

public class BOJ_B4_30468_호반우가학교에지각한이유 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += scann.nextInt();
		}
		
		int N = scann.nextInt();
		
		System.out.println(Math.max(0, N*4-sum));

	}

}
