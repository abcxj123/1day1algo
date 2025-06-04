import java.util.Scanner;

public class BOJ_B4_31962_등교 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int X = scann.nextInt();
		int max = -1;
		
		for (int i = 0; i < N; i++) {
			int S = scann.nextInt();
			int T = scann.nextInt();
			
			if(S+T <= X) {
				max = Math.max(max, S);
			}
		}
		
		System.out.println(max);
		
	}

}
