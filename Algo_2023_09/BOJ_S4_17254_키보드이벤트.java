import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Alpha implements Comparable<Alpha> {
	int idx;
	int time;
	char c;
	
	public Alpha(int idx, int time, char c) {
		this.idx = idx;
		this.time = time;
		this.c = c;
	}

	@Override
	public int compareTo(Alpha o) {
		if(this.time != o.time) {
			return Integer.compare(this.time, o.time);
		} else {
			return Integer.compare(this.idx, o.idx);
		}
	}
	
}

public class BOJ_S4_17254_키보드이벤트 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Alpha> list = new ArrayList<>();
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int idx = Integer.parseInt(st.nextToken());
			int time = Integer.parseInt(st.nextToken());
			char c = st.nextToken().charAt(0);
			
			list.add(new Alpha(idx, time, c));
			
		}
		
		Collections.sort(list);
		
		for (Alpha now : list) {
			sb.append(now.c);
		}
		
		System.out.println(sb.toString());
		

	}

}
