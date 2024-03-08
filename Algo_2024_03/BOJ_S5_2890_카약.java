import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S5_2890_카약 {
	static class Kayak implements Comparable<Kayak> {
		int idx;
		int dist;
		
		public Kayak(int idx, int dist) {
			this.idx = idx;
			this.dist = dist;
		}

		@Override
		public int compareTo(Kayak o) {
			return Integer.compare(o.dist, this.dist);
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		List<Kayak> list = new ArrayList<Kayak>();
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 1; j < M-1; j++) {
				char c = str.charAt(j);
				if(c == '.') continue;
				
				int idx = c - '0' - 1;
				list.add(new Kayak(idx, j));
				break;
			}
		}
		
		Collections.sort(list);
		
		int rank = 0;
		int past = M;
		int [] res = new int[9];
		
		for(Kayak cur : list) {
			int idx = cur.idx;
			int dist = cur.dist;
			if(dist < past) {
				rank++;
				past = dist;
			}
			res[idx] = rank;
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 9; i++) {
			sb.append(res[i]).append('\n');
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
