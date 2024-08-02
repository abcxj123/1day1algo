import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S5_6032_Toy_Shopping {
	static class Toy implements Comparable<Toy> {
		int idx;
		int j;
		int p;
		
		public Toy(int idx, int j, int p) {
			this.idx = idx;
			this.j = j;
			this.p = p;
		}

		@Override
		public int compareTo(Toy o) {
			return Double.compare((double)o.j/o.p, (double)this.j/this.p);
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		List<Toy> list = new ArrayList<>();
		
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int j = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			list.add(new Toy(i, j, p));
		}
		
		Collections.sort(list);
		
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 3; i++) {
			Toy t = list.get(i);
			sum += t.p;
			sb.append(t.idx+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sum);
		System.out.println(sb.toString());

	}

}
