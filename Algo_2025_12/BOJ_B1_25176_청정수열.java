import java.util.Scanner;

public class BOJ_B1_25176_청정수열 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int N = scann.nextInt();

	    int ans = 1;

	    for (int i = 1; i <= N; i++) {
	    	ans *= i;
	    }

	    System.out.println(ans);
	
	}
	
}
