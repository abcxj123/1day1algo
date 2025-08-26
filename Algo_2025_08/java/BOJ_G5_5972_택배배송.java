import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_G5_5972_택배배송 {
	static int [] dist;
	static List<ArrayList<Node>> list = new ArrayList<>();
	static int N, M;
	
	static class Node implements Comparable<Node> {
		int v;
		int cost;
		
		public Node(int v, int cost) {
			this.v = v;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.cost, o.cost);
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		dist = new int[N+1];
		
		list = new ArrayList<>();
		
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<>());
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int val = Integer.parseInt(st.nextToken());
			
			list.get(a).add(new Node(b, val));
			list.get(b).add(new Node(a, val));
		}
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		dijkstra();
		
		System.out.println(dist[N]);
	}

	private static void dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(1, 0));
		dist[1] = 0;
		
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			
			for(Node next : list.get(cur.v)) {
				if(dist[next.v] > dist[cur.v]+next.cost) {
					dist[next.v] = dist[cur.v]+next.cost;
					pq.add(new Node(next.v, dist[next.v]));
				}
			}
		}
		
	}

}
