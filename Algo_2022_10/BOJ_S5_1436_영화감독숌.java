import java.util.Scanner;

public class BOJ_S5_1436_영화감독숌 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int cnt = 0;
		long num = 665;
		
		while(cnt != N) {
			num++;
			if((String.valueOf(num)).contains("666")) {
				cnt++;
			}
		}
		
		System.out.println(num);

	}

}
