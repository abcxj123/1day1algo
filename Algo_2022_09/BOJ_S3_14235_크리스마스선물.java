import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ_S3_14235_크리스마스선물 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			if(n == 0) {
				if(pq.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(pq.poll());
				}
			} else {
				for (int j = 0; j < n; j++) {
					pq.add(scann.nextInt());
				}
			}
			
		}

	}

}
