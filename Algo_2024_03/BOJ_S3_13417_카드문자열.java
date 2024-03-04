	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayDeque;
	import java.util.Deque;
	import java.util.StringTokenizer;
	
	public class BOJ_S3_13417_카드문자열 {
	
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			int T = Integer.parseInt(br.readLine());
			
			for (int t = 1; t <= T; t++) {
				int N = Integer.parseInt(br.readLine());
				Deque<Character> deq = new ArrayDeque<Character>();
				
				StringTokenizer st = new StringTokenizer(br.readLine());
				char init = st.nextToken().charAt(0);
				deq.add(init);
				
				for (int i = 1; i < N; i++) {
					char c = st.nextToken().charAt(0);
					if(c <= deq.peekFirst()) {
						deq.addFirst(c);
					} else {
						deq.addLast(c);
					}
				}
				
				while(!deq.isEmpty()) {
					sb.append(deq.pollFirst());
				}
				
				sb.append('\n');
				
			}
			
			if(sb.length() > 0) {
				sb.setLength(sb.length()-1);
			}
			
			System.out.println(sb.toString());
			
		}
	
	}
