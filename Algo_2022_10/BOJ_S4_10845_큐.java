import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ_S4_10845_큐 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deq = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String command = br.readLine();
			
			switch (command) {
			case "pop":
				if(!deq.isEmpty()) {
					System.out.println(deq.pollFirst());
				} else {
					System.out.println(-1);
				}
				break;
				
			case "size":
				System.out.println(deq.size());
				break;
				
			case "empty":
				if(deq.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
				
			case "front":
				if(!deq.isEmpty()) {
					System.out.println(deq.getFirst());
				} else {
					System.out.println(-1);
				}
				break;
				
			case "back":
				if(!deq.isEmpty()) {
					System.out.println(deq.getLast());
				} else {
					System.out.println(-1);
				}
				break;

			default:
				String [] arr = command.split(" ");
				deq.add(Integer.parseInt(arr[1]));
				break;
			}
		}

	}

}
