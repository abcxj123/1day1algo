import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_S5_2161_카드1 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		Queue<Integer> q = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		while(true) {
			int a = q.poll();
			sb.append(a).append(" ");
			
			if(!q.isEmpty()) {
				int b = q.poll();
				q.add(b);
			} else {
				break;
			}

		}
		
		System.out.println(sb.toString());

	}

}
