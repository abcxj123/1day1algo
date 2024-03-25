import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S3_2346_풍선터뜨리기 {
	static class Balloon {
		int idx;
		int value;
		
		public Balloon(int idx, int value) {
			this.idx = idx;
			this.value = value;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Balloon> list = new ArrayList<Balloon>();
		
		for (int i = 1; i <= N; i++) {
			int value = Integer.parseInt(st.nextToken());
			list.add(new Balloon(i, value));
		}
		
		int idx = 0;
		
		while(list.size() > 0) {
			Balloon cur = list.get(idx);
			sb.append(cur.idx+" ");
			list.remove(idx);
			N--;
			
			if(list.size() == 0) break;
			
			if(cur.value > 0) {
				idx = (idx + cur.value - 1 + N) % N;
			} else if(cur.value < 0) {
				idx = (idx + cur.value + 1000*N) % N;
			}
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
