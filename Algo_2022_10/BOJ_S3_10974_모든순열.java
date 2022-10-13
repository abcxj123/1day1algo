import java.util.Scanner;

public class BOJ_S3_10974_모든순열 {
	
	static int N;
	static int [] nums;
	static boolean [] v;
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		N = scann.nextInt();
		nums = new int[N];
		v = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			nums[i] = (i+1);
		}
		
		perm(new int[N], 0);
	}

	private static void perm(int [] arr, int cnt) {
		if(cnt == N) {
			for(int n : arr) {
				System.out.print(n+" ");
			}
			System.out.println();
			return ;
		}
		
		for (int i = 0; i < N; i++) {
			if(!v[i]) {
				v[i] = true;
				arr[cnt] = nums[i];
				perm(arr, cnt+1);
				v[i] = false;
			}
		}
		
	}

}
