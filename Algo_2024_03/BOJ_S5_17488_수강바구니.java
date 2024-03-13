import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_S5_17488_수강바구니 {
	static int N, M;
	static int [] limit;
	static List<ArrayList<Integer>> subject;
	static List<HashSet<Integer>> cleared;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		limit = new int[M+1];
		cleared = new ArrayList<HashSet<Integer>>();
		subject = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i <= N; i++) {
			cleared.add(new HashSet<Integer>());
		}
		
		for (int i = 0; i <= M; i++) {
			subject.add(new ArrayList<Integer>());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= M; i++) {
			limit[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int t = 0; t < 2; t++) {
			for (int i = 1; i <= N ; i++) {
				st = new StringTokenizer(br.readLine());
				while(st.hasMoreTokens()) {
					int n = Integer.parseInt(st.nextToken());
					if(n == -1) break;
					
					subject.get(n).add(i);
				}
			}
			
			for (int i = 1; i <= M; i++) {
				int size = subject.get(i).size();
				if(size > limit[i]) {
					continue;
				}
				
				for(int person : subject.get(i)) {
					cleared.get(person).add(i);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		cleared.remove(0);
		for(HashSet<Integer> basket : cleared) {
			if(basket.size() == 0) {
				sb.append("망했어요\n");
				continue;
			}
			ArrayList<Integer> list = new ArrayList<Integer>(basket);
			Collections.sort(list);
			for(int n : list) {
				sb.append(n+" ");
			}
			sb.setLength(sb.length()-1);
			sb.append('\n');
		}
		
		sb.setLength(sb.length()-1);
		sb.append('\n');
		
		System.out.println(sb.toString());
	}

}
