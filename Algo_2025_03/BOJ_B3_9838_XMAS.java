import java.util.Scanner;

public class BOJ_B3_9838_XMAS {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int [] arr = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			int k = scann.nextInt();
			
			arr[k] = i;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= N; i++) {
			sb.append(arr[i]+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
