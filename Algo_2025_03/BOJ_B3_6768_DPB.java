import java.util.Scanner;

public class BOJ_B3_6768_DPB {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		if(N < 4) {
			System.out.println(0);
			System.exit(0);
		}
		
		int ans = 0;
		
		for (int i = 1; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				for (int k = j+1; k < N; k++) {
					if(j == k) continue;
					
					ans++;
				}
			}
		}
		
		System.out.println(ans);

	}

}
