import java.util.Scanner;

public class BOJ_B4_28431_양말짝맞추기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		boolean [] arr = new boolean[10];
		
		for (int i = 0; i < 5; i++) {
			int n = scann.nextInt();
			arr[n] = !arr[n];
		}
		
		int ans = -1;
		for (int i = 0; i < 10; i++) {
			if(arr[i]) {
				ans = i;
			}
		}
		
		System.out.println(ans);

	}

}
