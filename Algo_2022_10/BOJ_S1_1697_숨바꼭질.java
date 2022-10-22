import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_S1_1697_숨바꼭질 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int K = scann.nextInt();
		
		boolean [] v = new boolean[100001];
		
		Queue<int []> q = new LinkedList<int[]>();
		v[N] = true;
		q.add(new int [] {N, 0}); // idx, time
		
		while(!q.isEmpty()) {
			int [] cur = q.poll();
			int idx = cur[0];
			int time = cur[1];
			
			if(idx == K) {
				System.out.println(time);
				System.exit(0);
			}
			
			int future = idx*2;
			if(future <= 100000 && !v[future]) {
				v[future] = true;
				q.add(new int[] {future, time+1});
			}
			
			int past = idx-1;
			if(past >= 0 && !v[past]) {
				v[past] = true;
				q.add(new int[] {past, time+1});
			}
			
			int next = idx+1;
			if(next <= 100000 && !v[next]) {
				v[next] = true;
				q.add(new int[] {next, time+1});
			}
			
		}
		
	}

}
