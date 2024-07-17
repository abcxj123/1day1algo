import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S5_6160_Election_Time {
	static class Cow implements Comparable<Cow> {
		int idx;
		int A;
		int B;
		
		public Cow(int idx, int a, int b) {
			this.idx = idx;
			A = a;
			B = b;
		}

		@Override
		public int compareTo(Cow o) {
			return Integer.compare(o.A, this.A);
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		List<Cow> list = new ArrayList<>();
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			list.add(new Cow(i, A, B));
			
		}
		
		Collections.sort(list);
		
		int maxIdx = -1;
		int max = 0;
		
		for (int i = 0; i < K; i++) {
			Cow c = list.get(i);
			
			if(c.B > max) {
				maxIdx = c.idx;
				max = c.B;
			}
		}
		
		System.out.println(maxIdx);
		
	}

}
