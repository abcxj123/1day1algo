import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_G4_16202_MST게임 {
	
	static class P implements Comparable<P> {
		int start;
		int end;
		int weight;
		
		public P(int start, int end, int weight) {
			this.start = start;
			this.end = end;
			this.weight = weight;
		}

		@Override
		public int compareTo(P o) {
			return Integer.compare(this.weight, o.weight);
		}
		
	}
	
	static PriorityQueue<P> pq;
	static int N, K;
	static int [] parent;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		pq = new PriorityQueue<>();
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			P p = new P(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), i+1);
			
			pq.add(p);
		}
		
		boolean check = false;
		for (int i = 0; i < K; i++) {
			if(check) {
				sb.append("0 ");
				continue;
			}
			
			int score = findScore(i);
			if(score == 0) {
				check = true;
			}
			sb.append(score+" ");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

	private static int findScore(int n) {
		PriorityQueue<P> tmp = new PriorityQueue<>(pq);
		parent = new int[N+1];
		int score = 0;
		int cnt = 0;
		
		for (int i = 1; i <= N; i++) {
			parent[i] = i;
		}
		
		for (int i = 0; i < n; i++) {
			if(!tmp.isEmpty()) {
				tmp.poll();
			}
		}
		
		while(!tmp.isEmpty()) {
			P p = tmp.poll();
			
			int aParent = find(p.start);
			int bParent = find(p.end);
			if(aParent != bParent) {
				union(aParent, bParent);
				score += p.weight;
				cnt++;
			}
		}
		
		if(cnt == N-1) {
			return score;
		} else {
			return 0;
		}
	}

	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a != b) {
			parent[b] = a;
		}
	}

	private static int find(int n) {
		if(parent[n] == n) return n;
		return parent[n] = find(parent[n]);
	}

}
