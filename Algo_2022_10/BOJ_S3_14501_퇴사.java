import java.util.Scanner;

public class BOJ_S3_14501_퇴사 {
	static int N;
	static int [][] arr;
	static int max;
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = scann.nextInt();
			arr[i][1] = scann.nextInt();
		}
		
		find(0, 0);
		
		System.out.println(max);
		
	}

	private static void find(int idx, int money) {
		if(idx == N) {
			max = Math.max(money, max);
			return ;
		} else if (idx > N ) return;
		
		int day = arr[idx][0];
		int value = arr[idx][1];
		
		find(idx+day, money+value);
		
		find(idx+1, money);
		
	}

}
