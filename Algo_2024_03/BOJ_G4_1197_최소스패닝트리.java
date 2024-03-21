import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_G4_1197_최소스패닝트리 {
	static class Node implements Comparable<Node> {
		int a;
		int b;
		int cost;

		public Node(int a, int b, int cost) {
			this.a = a;
			this.b = b;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.cost, o.cost);
		}
	}
	static int [] parent;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		parent = new int[N];
		
		for (int i = 0; i < N; i++) {
			parent[i] = i;
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			int cost = Integer.parseInt(st.nextToken());
			
			pq.add(new Node(a, b, cost));
		}
		
		int cnt = 0;
		int ans = 0;
		
		while(cnt < N-1) {
			Node cur = pq.poll();
			
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
		parent[b] = a;
	}

	private static int find(int a) {
		if(parent[a] == a) return a;
		
		return parent[a] = find(parent[a]);
	}

}
