import java.util.Scanner;

public class BOJ_B3_28135_Since1973 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int ans = 1;
		
		for (int i = 1; i < N; i++) {
			if(String.valueOf(i).contains("50")) ans++;
			
			ans++;
		}
		
		System.out.println(ans);

	}

}
