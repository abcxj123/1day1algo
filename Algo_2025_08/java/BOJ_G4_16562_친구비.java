import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_G4_16562_친구비 {
	static int [] parent, pay;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		parent = new int[N+1];
		pay = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			parent[i] = i;
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			pay[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
		
			if(find(v) != find(w)) union(v, w);
		}
		
		int sum = 0;
		Set<Integer> set = new HashSet<>();
		
		for (int i = 1; i <= N; i++) {
			int n = find(i);
			
			if(!set.contains(n)) {
				set.add(n);
				sum += pay[n];
			}
		}
		
		if(sum <= K) System.out.println(sum);
		else System.out.println("Oh no");
		
	}
	
	private static void union(int v, int w) {
		v = find(v);
		w = find(w);
		
		if(pay[v] <= pay[w]) {
			parent[w] = v;
		} else {
			parent[v] = w;
		}
		
	}

	private static int find(int v) {
		if(v == parent[v]) return v;
		return parent[v] = find(parent[v]);
	}

}
