import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_S2_23757_아이들과선물상자 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		boolean flag = true;
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Integer [] arr = new Integer[M];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			pq.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < M; i++) {
			int kid = arr[i];
			int gift = pq.poll();
			if(kid > gift) {
				flag = false;
				break;
			} else if(gift > kid) {
				int diff = gift-kid;
				pq.add(diff);
			}
		}
		
		if(flag) System.out.println(1);
		else System.out.println(0);
		
	}

}
