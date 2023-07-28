import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_G4_16197_두동전 {
	
	static class Coins {
		int r1;
		int c1;
		int r2;
		int c2;
		int time;
		
		public Coins(int r1, int c1, int r2, int c2, int time) {
			this.r1 = r1;
			this.c1 = c1;
			this.r2 = r2;
			this.c2 = c2;
			this.time = time;
		}
		
	}

	static int N, M, min;
	static char [][] map;
	static Set<String> v;
	static int [] dr = {-1, 0, 1, 0};
	static int [] dc = {0, 1, 0, -1};
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char[N][M];
		v = new HashSet<>();
		min = 11;
		
		List<int []> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				char c = str.charAt(j);
				if(c == 'o') {
					list.add(new int[] {i, j});
				}
				map[i][j] = c;
			}
		}
		
		int [] coin1 = list.get(0);
		int [] coin2 = list.get(1);
		
		sb.append(coin1[0]).append(coin1[1]).append(coin2[0]).append(coin2[1]);
		v.add(sb.toString());
		
		bfs(coin1[0], coin1[1], coin2[0], coin2[1]);
		
		if(min == 11) {
			min = -1;
		} 
		
		System.out.println(min);

	}

	private static void bfs(int r1, int c1, int r2, int c2) {
		Queue<Coins> q = new LinkedList<Coins>();
		q.add(new Coins(r1, c1, r2, c2, 0));
		
		while(!q.isEmpty()) {
			Coins cur = q.poll();
			
			if(cur.time >= 10) return ;
			
			for (int d = 0; d < 4; d++) {
				int nr1 = cur.r1+dr[d];
				int nc1 = cur.c1+dc[d];
				int nr2 = cur.r2+dr[d];
				int nc2 = cur.c2+dc[d];
				
				if(!check(nr1, nc1) && !check(nr2, nc2)) continue;
				else if((!check(nr1, nc1) && check(nr2, nc2)) || (check(nr1, nc1) && !check(nr2, nc2))) {
//					System.out.println("탈출 : "+nr1+" "+nc1+", "+nr2+" "+nc2+" : "+(cur.time+1));
					min = cur.time + 1;
					return ;
				}
				
				if(map[nr1][nc1] == '#' && map[nr2][nc2] == '#') continue;
				else if(map[nr1][nc1] == '#' && map[nr2][nc2] != '#') {
					if(cur.r1 == nr2 && cur.c1 == nc2) continue;
					nr1 = cur.r1;
					nc1 = cur.c1;
				} else if(map[nr1][nc1] != '#' && map[nr2][nc2] == '#') {
					if(cur.r2 == nr1 && cur.c2 == nc1) continue;
					nr2 = cur.r2;
					nc2 = cur.c2;
				}
				
				sb.setLength(0);
				sb.append(nr1).append(nc1).append(nr2).append(nc2);
				
				if(v.contains(sb.toString())) continue;
				
				v.add(sb.toString());
				
				q.add(new Coins(nr1, nc1, nr2, nc2, cur.time+1));
//				System.out.println(nr1+" "+nc1+", "+nr2+" "+nc2+" : "+(cur.time+1)+" /// "+map[nr1][nc1]+map[nr2][nc2]);
				
			}
			
		}
		
	}

	private static boolean check(int r, int c) {
		return r>=0 && r<N && c>=0 && c<M;
	}

}
