import java.util.Scanner;

public class BOJ_B1_1816_암호키 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		long [] arr = new long[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = scann.nextLong();
		}
		
		int max = (int) Math.pow(10, 6);
		StringBuilder sb = new StringBuilder();
		
		outer:
			for (int i = 0; i < N; i++) {
				long n = arr[i];
				
				for (long j = 2L; j <= max; j++) {
					if(n % j == 0) {
						sb.append("NO\n");
						continue outer;
					}
				}
				
				sb.append("YES\n");
				
			}
		
		System.out.println(sb.toString());

	}

}
