import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_S4_2164_카드2 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		
		int N = scann.nextInt();
		
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		if(q.size() == 1) {
			System.out.println(q.poll());
		} else {
			while(true) {
				q.poll();
				if(q.size() == 1) {
					System.out.println(q.poll());
					break;
				}
				int n = q.poll();
				q.add(n);
			}
		}
		
	}

}
