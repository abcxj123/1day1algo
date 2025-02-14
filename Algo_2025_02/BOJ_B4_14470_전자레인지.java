import java.util.Scanner;

public class BOJ_B4_14470_전자레인지 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt();
		int B = scann.nextInt();
		int C = scann.nextInt();
		int D = scann.nextInt();
		int E = scann.nextInt();
		
		int ans = 0;
		
		if(A < 0) {
			ans += Math.abs(A)*C + D + B*E;
		} else if(A == 0) {
			ans += D + B*E;
		} else {
			ans += (B-A)*E;
		}
		
		System.out.println(ans);

	}

}
