import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_G5_18405_경쟁적전염 {
	static class Virus implements Comparable<Virus> {
		int r;
		int c;
		int value;
		
		public Virus(int r, int c, int value) {
			this.r = r;
			this.c = c;
			this.value = value;
		}

		@Override
		public int compareTo(Virus o) {
			return Integer.compare(this.value, o.value);
		}
		
	}
	static int N, S;
	static PriorityQueue<Virus> pq = new PriorityQueue<>();
	static Queue<Virus> q = new LinkedList<>();
	static int [][] map;
	static boolean [][] v;
	static int [] dr = {-1, 0, 1, 0};
	static int [] dc = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		map = new int[N][N];
		v = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int n = Integer.parseInt(st.nextToken());
				map[i][j] = n;
				if(n > 0) {
					pq.add(new Virus(i, j, n));
				}
			}
		}
		
		st = new StringTokenizer(br.readLine());
		S = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		
		while(!pq.isEmpty()) {
			Virus cur = pq.poll();
			v[cur.r][cur.c] = true;
			q.add(new Virus(cur.r, cur.c, cur.value));
		}
		
		bfs();
		
		System.out.println(map[X-1][Y-1]);
		
	}

	private static void bfs() {
		int time = 0;
		
		while(!q.isEmpty()) {
			if(time >= S) break;
			int size = q.size();
			
			for (int t = 0; t < size; t++) {
				Virus cur = q.poll();
				
				for (int d = 0; d < 4; d++) {
					int nr = cur.r+dr[d];
					int nc = cur.c+dc[d];
					
					if(!check(nr, nc)) continue;
					
					if(!v[nr][nc] && map[nr][nc] == 0) {
						map[nr][nc] = cur.value;
						v[nr][nc] = true;
						q.add(new Virus(nr, nc, cur.value));
					}
					
				}
				
			}
			
			time++;
			
		}
		
	}

	private static boolean check(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < N;
	}

}
