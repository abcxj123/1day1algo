import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S1_2583_영역구하기 {
	
	static int M, N;
	static int [][] map;
	static List<Integer> list = new ArrayList<>(); 
	static boolean [][] v;
	static int [] dr = {-1, 1, 0, 0};
	static int [] dc = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		map = new int[M][N];
		v = new boolean[M][N];
		
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for (int j = y1; j < y2; j++) {
				for (int l = x1; l < x2; l++) {
					map[j][l] = 1;
				}
			}
		}
		
//		for (int i = 0; i < M; i++) {
//			for (int j = 0; j < N; j++) {
//				System.out.print(map[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j] == 0) {
					bfs(i, j);
				}
			}
		}
		
		Collections.sort(list);
		int size = list.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			System.out.print(list.get(i)+" ");
		}

	}

	private static void bfs(int i, int j) {
		Queue<int []> q = new LinkedList<int[]>();
		v[i][j] = true;
		q.add(new int[] {i, j});
		int cnt = 1;
		
		while(!q.isEmpty()) {
			int [] cur = q.poll();
			int curR = cur[0];
			int curC = cur[1];
			
			for (int d = 0; d < 4; d++) {
				int nr = curR+dr[d];
				int nc = curC+dc[d];
				
				if(!check(nr, nc)) continue;
				
				if (!v[nr][nc] && map[nr][nc] == 0){
					map[nr][nc] = 2;
					v[nr][nc] = true;
					q.add(new int[] {nr, nc});
					cnt++;
				}
			}
			
		}
		
		list.add(cnt);
		
	}

	private static boolean check(int r, int c) {
		return r>=0 && r<M && c>=0 && c<N;
	}

}
