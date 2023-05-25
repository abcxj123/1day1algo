import java.util.Scanner;

public class BOJ_B2_5618_공약수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		int [] nums = new int[N];
		
		for (int i = 0; i < N; i++) {
			nums[i] = scann.nextInt();
		}
		
		int min = 0;
		
		if(N == 2) {
			min = Math.min(nums[0], nums[1]);
		} else {
			min = Math.min(nums[0], Math.min(nums[1], nums[2]));
		}
		
		for (int i = 1; i <= min; i++) {
			boolean check = true;
			for (int j = 0; j < N; j++) {
				if(nums[j] % i != 0) {
					check = false;
					break;
				}
			}
			if(check) {
				sb.append(i+"\n");
			}
		}
		
		System.out.println(sb.toString());

	}

}
