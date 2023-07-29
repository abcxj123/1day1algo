import java.util.Scanner;

public class BOJ_B1_5533_유니크 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		int [][] arr = new int[N][3];
		int [] score = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = scann.nextInt();
			arr[i][1] = scann.nextInt();
			arr[i][2] = scann.nextInt();
		}
		
		for (int i = 0; i < 3; i++) {
			int [] cnt = new int[101];
			for (int j = 0; j < N; j++) {
				int n = arr[j][i];
				cnt[n]++;
			}
			
			for (int j = 0; j < N; j++) {
				int n = arr[j][i];
				if(cnt[n] == 1) score[j] += n;
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(score[i]);
		}

	}

}
