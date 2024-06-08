import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S5_20949_효정과새모니터 {

	static class Monitor implements Comparable<Monitor> {
		int idx;
		double value;
		
		public Monitor(int idx, double value) {
			this.idx = idx;
			this.value = value;
		}

		@Override
		public int compareTo(Monitor o) {
			if(this.value != o.value) {
				return Double.compare(o.value, this.value);
			} 
			return Integer.compare(this.idx, o.idx);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Monitor> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int W = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());
			
			double value = Math.sqrt(W*W + H*H) / 77;
			list.add(new Monitor(i+1, value));
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		
		for (Monitor m : list) {
			sb.append(m.idx+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
