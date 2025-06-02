import java.util.Scanner;

public class BOJ_B3_5724_파인만 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		while(true) {
			int n = scann.nextInt();
			
			if(n == 0) break;
			
			int sum = 0;
			
			for (int i = 1; i <= n; i++) {
				sum += (n-i+1) * (n-i+1);
			}
			
			System.out.println(sum);
			
		}

	}

}
