import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_G5_2107_포함하는구간 {
	static class Section implements Comparable<Section> {
		int start;
		int end;
		int val;
		
		public Section(int start, int end, int val) {
			this.start = start;
			this.end = end;
			this.val = val;
		}

		@Override
		public int compareTo(Section o) {
			return Integer.compare(this.start, o.start);
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Section> origin = new PriorityQueue<>();
		List<Section> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			origin.add(new Section(start, end, 0));
		}
		
		list.add(origin.poll());
		
		int max = 0;
		int idx = 0;
		
		while(!origin.isEmpty()) {
			Section poll = origin.poll();
			
			int newIdx = idx;
			boolean flag = true;
			while(newIdx < list.size()) {
				Section now = list.get(newIdx);
				
				if(now.end > poll.end) {
					list.get(newIdx).val++;
					flag = false;
				} else if(now.end < poll.start) {
					idx++;
					max = Math.max(max, now.val);
				}
				
				newIdx++;
			}
			
			if(flag) list.add(poll);
		}
		
		for (int i = idx; i < list.size(); i++) {
			max = Math.max(max, list.get(i).val);
		}
		
		System.out.println(max);
		
	}

}
