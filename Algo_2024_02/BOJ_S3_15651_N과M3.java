import java.util.Scanner;

public class BOJ_S3_15651_N과M3 {
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int [] nums, picks;
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		M = scann.nextInt();
		
		nums = new int[N];
		picks = new int[M];
		
		for (int i = 0; i < N; i++) {
			nums[i] = i+1;
		}
		
		perm(0);
		
		System.out.println(sb.toString());
		
	}

	private static void perm(int cnt) {
		if(cnt == M) {
			for (int i = 0; i < M; i++) {
				sb.append(picks[i]+" ");
			}
			sb.setLength(sb.length()-1);
			sb.append('\n');
			
			return;
		}
		
		for (int i = 0; i < N; i++) {
			picks[cnt++] = nums[i];
			perm(cnt);
			cnt--;
		}
		
	}

}
