import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_G4_3190_뱀 {
	
	static int N, L;
	static int [] dr = {0, 1, 0, -1}; // 오아왼위
	static int [] dc = {1, 0, -1, 0}; // 오아왼위
	static int time;
	static int [][] map; // 사과:1, 뱀:2
	static boolean [][] v;
	static int [][] command;
	static int d = 0;
	static Queue<int[]> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		v = new boolean[N][N];
		
		int K = Integer.parseInt(br.readLine());
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken())-1;
			int c = Integer.parseInt(st.nextToken())-1;
			map[r][c] = 1;
		}
		
		L = Integer.parseInt(br.readLine());
		command = new int[L][2];
		for (int i = 0; i < L; i++) {
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			char c = st.nextToken().charAt(0);
			command[i][0] = t;
			if(c == 'L') {
				command[i][1] = -1;
			} else {
				command[i][1] = 1;
			}
		}
		
		play();
		
		System.out.println(time);
		
	}

	private static void play() {
		v[0][0] = true;
		q.add(new int[] {0, 0});
		int r = 0;
		int c = 0;
		int idx = 0;
		
		while(true) {
			time++;
			
			int nr = r+dr[d];
			int nc = c+dc[d];
			
			if(!check(nr, nc) || v[nr][nc]) break; 
			
			if(map[nr][nc] != 1) {
				int [] tail = q.poll();
				v[tail[0]][tail[1]] = false;
			} else if(map[nr][nc] == 1) {
				map[nr][nc] = 0;
			}

			q.add(new int[] {nr, nc});
			v[nr][nc] = true;
			r = nr;
			c = nc;
			
			if(idx < L) {
				if(time == command[idx][0]) {
					d = (d+command[idx][1]+4) % 4;
					idx++;
				}
			}
			
		}
		
	}

	private static boolean check(int r, int c) {
		return r>= 0 && r<N && c>=0 && c<N;
	}

}
