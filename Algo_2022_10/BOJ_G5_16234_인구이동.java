import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_G5_16234_인구이동 {
	// 1. 큐에 뭘 넣지? -> 0,0부터 넣은 뒤 visited가 false면 넣어본다. 약간의 브루트포스?
	// 2. bfs 돌리고, list에 넣어놓은 뒤, 총합을 더한 후 list를 하나씩 확인 후 나누어서 값을 재갱신한다.
	// 3. 인구 이동이 1번이라도 일어났으면 과정 반복.
	// 4. 한번도 일어나지 않으면 루프문을 나와서 day 출력  (flag true 조건 : 한번이라도 인구 이동이 일어남)
	
	static int N, L, R;
	static int day;
	static int [][] map;
	static boolean [][] v;
	static boolean flag;
	static ArrayList<int []> list;
	static int [] dr = {-1, 1, 0, 0};
	static int [] dc = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		map = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		while(true) {
			v = new boolean[N][N];
			flag = false;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(!v[i][j]) {
						bfs(i, j);
					}
				}
			}
			
			if(!flag) break;
			day++;
		}
		
		System.out.println(day);
	}

	private static void bfs(int r, int c) {
		int sum = map[r][c];
		v[r][c] = true;
		list = new ArrayList<>();
		list.add(new int[] {r, c});
		Queue<int []> q = new LinkedList<>();
		q.add(new int[] {r, c});
		
		while(!q.isEmpty()) {
			int [] cur = q.poll();
			int value = map[cur[0]][cur[1]];
			
			for (int d = 0; d < 4; d++) {
				int nr = cur[0]+dr[d];
				int nc = cur[1]+dc[d];
				
				if(!check(nr, nc)) continue;
				if(v[nr][nc]) continue;
				
				int diff = Math.abs(map[nr][nc] - value);
				
				if(diff >= L && diff <= R) {
					sum += map[nr][nc];
					v[nr][nc] = true;
					list.add(new int[] {nr, nc});
					q.add(new int[] {nr, nc});
				}
				
			}
		}
		
		if(sum > map[r][c]) {
			int size = list.size();
			sum /= size;
			flag = true;
			
			for(int i=0;i<size;i++) {
				int [] arr = list.get(i);
				map[arr[0]][arr[1]] = sum;
			}
		}
		
	}

	private static boolean check(int r, int c) {
		return r>=0 && r<N && c>=0 && c<N;
	}

}
