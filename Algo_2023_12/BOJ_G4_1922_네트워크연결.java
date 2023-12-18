import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_G4_1922_네트워크연결 {
		static int [] parent;
		
		static class Line implements Comparable<Line> {
			int a;
			int b;
			int cost;
			
			public Line(int a, int b, int cost) {
				this.a = a;
				this.b = b;
				this.cost = cost;
			}

			@Override
			public int compareTo(Line o) {
				return Integer.compare(this.cost, o.cost);
			}
			
		}
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		parent = new int[N+1];
		for (int i = 1; i <= N; i++) {
			parent[i] = i;
		}
		
		PriorityQueue<Line> pq = new PriorityQueue<>();
		
		for (int i = 0; i < M; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			pq.add(new Line(a, b, cost));
		}
		
		int ans = 0;
		int cnt = 0;
		
		while(cnt < N-1) {
			Line cur = pq.poll();
			
			if(cur.a == cur.b) continue;
			
			if(find(cur.a) == find(cur.b)) continue;
			
			union(cur.a, cur.b);
			ans += cur.cost;
			
			cnt++;
		}
		
		System.out.println(ans);
		
	}

	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		
		if(a != b) {
			parent[b] = a;
		}
		
	}

	private static int find(int a) {
		if(parent[a] == a) return a;
		return parent[a] = find(parent[a]);
	}

}
