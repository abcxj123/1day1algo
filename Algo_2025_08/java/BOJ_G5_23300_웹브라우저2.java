import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_G5_23300_웹브라우저2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		Deque<Integer> backward = new ArrayDeque<>();
		Deque<Integer> forward = new ArrayDeque<>();
		
		int now = -1;
		
		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			
			char c = st.nextToken().charAt(0);
			
			switch (c) {
			case 'B':
				if(backward.size() == 0) break;
				
				forward.push(now);
				now = backward.pop();
				
				break;
			
			case 'F':
				if(forward.size() == 0) break;
				
				backward.push(now);
				now = forward.pop();
				
				break;
				
			case 'A':
				forward.clear();
				
				if(now != -1) {
					backward.push(now);
				}
				
				now = Integer.parseInt(st.nextToken());
	
				break;
	
			case 'C':
				Deque<Integer> deq = new ArrayDeque<>();
				int past = -1;
				
				for(int n : backward) {
					if(past != n) {
						deq.addLast(n);
						past = n;
					}
				}
				
				backward = deq;
	
				break;

			default:
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(now+"\n");
		
		if(backward.isEmpty()) {
			sb.append("-1\n");
		} else {
			while(!backward.isEmpty()) {
				sb.append(backward.pop()+" ");
			}
			sb.setLength(sb.length()-1);
			sb.append("\n");
		}
		
		if(forward.isEmpty()) {
			sb.append("-1\n");
		} else {
			while(!forward.isEmpty()) {
				sb.append(forward.pop()+" ");
			}
			sb.setLength(sb.length()-1);
		}
		
		System.out.println(sb.toString());
		
	}

}
