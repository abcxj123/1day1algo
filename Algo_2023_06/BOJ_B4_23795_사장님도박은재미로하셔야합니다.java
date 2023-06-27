import java.util.Scanner;

public class BOJ_B4_23795_사장님도박은재미로하셔야합니다 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int ans = 0;
		
		while(true) {
			int n = scann.nextInt();
			if(n == -1) break;
			ans += n;
		}
		
		System.out.println(ans);

	}

}
