import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_G4_25187_고인물이싫어요 {
	static int [] parent, size, tank;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		parent = new int[N+1];
		size = new int[N+1];
		tank = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			parent[i] = i;
			size[i] = 1;
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			tank[i] = Integer.parseInt(st.nextToken()) == 1 ? 1 : -1;
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
		
			if(find(a) != find(b)) union(a, b);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < Q; i++) {
			int x = Integer.parseInt(br.readLine());
			int pIdx = find(x);
			
			if(tank[pIdx] > 0) sb.append("1\n");
			else sb.append("0\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		
		if(size[a] >= size[b]) {
			parent[b] = a;
			size[a] += size[b];
			tank[a] += tank[b];
		} else {
			parent[a] = b;
			size[b] += size[a];
			tank[b] += tank[a];
		}
		
	}

	private static int find(int x) {
		if(x == parent[x]) return x;
		return parent[x] = find(parent[x]);
	}

}
