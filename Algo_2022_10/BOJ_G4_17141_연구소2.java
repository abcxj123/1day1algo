import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_G4_17141_연구소2 {
	// 1. 맵 정보를 입력받을 때 2라면 list에 r, c값을 넣고 0으로 받는다.
	// 2. list를 조합 알고리즘을 사용해 M개를 뽑는다.
	// 3. 각각의 경우마다 bfs를 돌리고, 최소 시간을 찾는다. (브루트포스) 재할당 vs 
	static int [][] map;
	static ArrayList<int []> list = new ArrayList<>();
	static int min = Integer.MAX_VALUE;
	static int N, M, size;
	static int [] dr = {-1, 1, 0, 0};
	static int [] dc = {0, 0, -1, 1};
	static int [] nums;
	static int [] picks;
	static boolean [] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int n = Integer.parseInt(st.nextToken());
				if(n == 2) {
					list.add(new int[] {i, j});
					map[i][j] = 0;
				} else if (n == 1) {
					map[i][j] = -1;
				}
			}
		}
		
		size = list.size();
		nums = new int[size];
		visit = new boolean[size];
		picks = new int[M];
		
		for (int i = 0; i < size; i++) {
			nums[i] = i;
		}
		
		combi(0, 0);
		
		boolean flag = false;
		
		for (int i = 0; i < N; i++) {
			if(flag) break;
			for (int j = 0; j < N; j++) {
				if(map[i][j] == 0) {
					flag = true;
					break;
				}
			}
		}
		
		if (min == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(min-1);
		}

	}

	private static void combi(int start, int cnt) {
		if(cnt == M) {
			bfs(picks);
			
			return ;
		}
		
		for (int i = start; i < size; i++) {
			if(!visit[i]) {
				visit[i] = true;
				picks[cnt] = nums[i];
				combi(i+1, cnt+1);
				visit[i] = false;
			}
		}
		
	}

	private static void bfs(int[] picks) {
		int [][] map2 = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			map2[i] = Arrays.copyOf(map[i], map[i].length);
		}
		
		boolean [][] v = new boolean[N][N];
		Queue<int []> q = new LinkedList<>();
		int max = 0;
		
		for(int idx : picks) {
			int [] tmp = list.get(idx);
			map2[tmp[0]][tmp[1]] = 1;
			v[tmp[0]][tmp[1]] = true;
			q.add(new int[] {tmp[0], tmp[1], 1});
		}
		
		while(!q.isEmpty()) {
			int [] cur = q.poll();
			int curR = cur[0];
			int curC = cur[1];
			int time = cur[2];
			
			for (int d = 0; d < 4; d++) {
				int nr = curR+dr[d];
				int nc = curC+dc[d];
				
				if(!check(nr, nc)) continue;
				
				if(!v[nr][nc] && map2[nr][nc] == 0) {
					map2[nr][nc] = time+1;
					max = Math.max(time+1, max);
					v[nr][nc] = true;
					q.add(new int[] {nr, nc, time+1});
				}
			}
		}
		
		boolean flag = false;
		
		for (int i = 0; i < N; i++) {
			if(flag) break;
			for (int j = 0; j < N; j++) {
				int n = map2[i][j];
				if(n == 0) {
					flag = true;
					break;
				} else {
					max = Math.max(max, n);
				}
			}
		}
		
		if(!flag) {
			min = Math.min(min, max);
		}
		
	}

	private static boolean check(int r, int c) {
		return r>=0 && r<N && c>=0 && c<N;
	}

}
