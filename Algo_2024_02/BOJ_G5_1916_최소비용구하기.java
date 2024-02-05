import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_G5_1916_최소비용구하기 {
	static class Node implements Comparable<Node> {
		int to;
		int cost;
		
		public Node(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.cost, o.cost);
		}
	}
	
	static int N;
	static List<ArrayList<Node>> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		list = new ArrayList<ArrayList<Node>>();
		
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<Node>());
		}
		
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			list.get(from).add(new Node(to, cost));
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		int ans = dijkstra(start, end);
		
		System.out.println(ans);
		
	}

	private static int dijkstra(int start, int end) {
		boolean [] v = new boolean[N+1];
		
		int [] dist = new int[N+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		dist[start] = 0;
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		pq.add(new Node(start, 0));
		
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			int cur = curNode.to;
			
			if(v[cur]) continue;
			
			v[cur] = true;
			
			for(Node node : list.get(cur)) {
				if(dist[cur] + node.cost < dist[node.to]) {
					dist[node.to] = dist[cur] + node.cost;
					pq.add(new Node(node.to, dist[node.to]));
				}
			}
			
		}
		
		return dist[end];
	}

}
