import java.util.Scanner;

public class BOJ_B2_5176_대회자리 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int K = scann.nextInt();
		
		for (int t = 1; t <= K; t++) {
			int P = scann.nextInt();
			int M = scann.nextInt();
			int cnt = 0;
			
			boolean [] arr = new boolean[M+1];
			
			for (int i = 0; i < P; i++) {
				int n = scann.nextInt();
				if(arr[n]) {
					cnt++;
				} else {
					arr[n] = true;
				}
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
