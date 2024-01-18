	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;
	import java.util.StringTokenizer;
	
	public class BOJ_G4_1043_거짓말 {
		
		// 비효율적으로 품
		static int N;
		static int [] parent, rank;
		static List<ArrayList<Integer>> list;
		
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			parent = new int[N+1];
			rank = new int[N+1];
			list = new ArrayList<ArrayList<Integer>>();
			for (int i = 0; i < M; i++) {
				list.add(new ArrayList<Integer>());
			}
			
			for (int i = 1; i <= N; i++) {
				parent[i] = i;
			}
			
			st = new StringTokenizer(br.readLine());
			
			int T = Integer.parseInt(st.nextToken());
			for (int i = 0; i < T; i++) {
				int n = Integer.parseInt(st.nextToken());
				rank[n]++;
			}
			
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int K = Integer.parseInt(st.nextToken());
				
				int a = Integer.parseInt(st.nextToken());
				list.get(i).add(a);
				
				for (int j = 1; j < K; j++) {
					int b = Integer.parseInt(st.nextToken());
					list.get(i).add(b);
					
					a = union(a, b);
				}
				
			}
			
			int ans = 0;
			
			for(ArrayList<Integer> alist : list) {
				boolean flag = true;
				for(int n : alist) {
					if(rank[find(n)] == 1) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					ans++;
				}
				
			}
			
			System.out.println(ans);
			
		}
	
		private static int union(int a, int b) {
			a = find(a);
			b = find(b);
			
			if(rank[a] > rank[b]) {
				parent[b] = a;
				return a;
			} else {
				parent[a] = b;
				return b;
			}
		}
	
		private static int find(int a) {
			if(parent[a] == a) return a;
			return parent[a] = find(parent[a]);
		}
	
	}
