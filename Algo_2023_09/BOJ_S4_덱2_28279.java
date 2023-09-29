import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_S4_덱2_28279 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deq = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int com = Integer.parseInt(st.nextToken());
			
			switch (com) {
			case 1:
				int n1 = Integer.parseInt(st.nextToken());
				deq.addFirst(n1);
				
				break;
			case 2:
				int n2 = Integer.parseInt(st.nextToken());
				deq.add(n2);
				
				break;
			case 3:
				if(!deq.isEmpty()) {
					int n3 = deq.pollFirst();
					sb.append(n3+"\n");
				} else {
					sb.append("-1\n");
				}
				
				break;
			case 4:
				if(!deq.isEmpty()) {
					int n4 = deq.pollLast();
					sb.append(n4+"\n");
				} else {
					sb.append("-1\n");
				}
				
				break;
			case 5:
				sb.append(deq.size()+"\n");
				
				break;
			case 6:
				if(deq.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
				
				break;
			case 7:
				if(!deq.isEmpty()) {
					int n7 = deq.peekFirst();
					sb.append(n7+"\n");
				} else {
					sb.append("-1\n");
				}
				
				break;
			case 8:
				if(!deq.isEmpty()) {
					int n8 = deq.peekLast();
					sb.append(n8+"\n");
				} else {
					sb.append("-1\n");
				}
				
				break;
			default:
				break;
			}
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
