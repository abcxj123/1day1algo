import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_S5_11866_요세푸스문제0 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		
		int N = scann.nextInt();
		int K = scann.nextInt();
		int [] ans = new int[N];
		
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		int nextIdx = 0;
		
		for (int i = 0; i < N; i++) {
			nextIdx = (nextIdx + K - 1) % list.size();
			int n = list.get(nextIdx);
			list.remove(nextIdx);
			ans[i] = n;
		}
		
		for (int i = 0; i < N; i++) {
			sb.append(ans[i]+", ");
		}
		
		sb.setLength(sb.length()-2);
		sb.append('>');
		
		System.out.println(sb.toString());
	}

}
