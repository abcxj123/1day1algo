import java.util.Scanner;

public class BOJ_B2_1977_완전제곱수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int M = scann.nextInt();
		int N = scann.nextInt();
		
		int sum = 0;
		int min = -1;
		
		for (int i = M; i <= N; i++) {
			int tmp = (int)Math.sqrt(i);
			if(tmp*tmp == i) {
				sum += i;
				if(min == -1) {
					min = i;
				}
			}
		}
		
		if(min == -1) {
			System.out.println(min);
		} else {			
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
