import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class BOJ_G5_12919_A와B2 {
	static String S;
	static int ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		S = br.readLine();
		String T = br.readLine();
		
		bfs(T);
		
		System.out.println(ans);
		
	}

	private static void bfs(String start) {
		Queue<String> q = new ArrayDeque<String>();
		Set<String> set = new HashSet<String>();
		set.add(start);
		q.add(start);
		
		while(!q.isEmpty()) {
			String cur = q.poll();
			
			if(cur.length() == S.length()) {				
				if(cur.equals(S)) {
					ans = 1;
					return;
				}
				continue;
			}
			
			int len = cur.length();
			if(cur.charAt(len-1) == 'A') {
				StringBuilder sb = new StringBuilder(cur);
				sb.setLength(sb.length()-1);
				if(!set.contains(sb.toString())) {
					set.add(sb.toString());
					q.add(sb.toString());
				}
			}
			
			if(cur.charAt(0) == 'B') {
				StringBuilder sb = new StringBuilder(cur).reverse();
				sb.setLength(sb.length()-1);
				if(!set.contains(sb.toString())) {
					set.add(sb.toString());
					q.add(sb.toString());
				}
			}
			
		}
		
	}

}
