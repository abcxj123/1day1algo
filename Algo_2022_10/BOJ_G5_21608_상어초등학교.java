import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {
	int r;
	int c;
	int like;
	int blank;
	
	public Node(int r, int c, int like, int blank) {
		this.r = r;
		this.c = c;
		this.like = like;
		this.blank = blank;
	}

	@Override
	public int compareTo(Node o) {
		if(this.like != o.like) {
			return o.like - this.like;
		} else if(this.blank != o.blank) {
			return o.blank - this.blank;
		} else if(this.r != o.r) {
			return this.r - o.r;
		} else {
			return this.c - o.c;
		}
	}
	
}

public class BOJ_G5_21608_상어초등학교 {
	
	// 1. 배열 안에 값들을 하나씩 집어넣는다. (학생번호, 좋아하는 학생 번호 각각 배열2개), 크기 N+1 주의
	// 2. 배열에서 하나씩 꺼내서 bfs를 진행한다.
	// 3. 맨 처음 값은 무조건 2,2에 들어간다.
	// 4. 배열 하나씩 i번째 친구가 들어갈 최적의 장소를 찾는다. PQ 사용.
	// 5. 모두 배치하고, N x N 행렬 브루트포스로 값을 구한다.
	
	static int N;
	static int [][] map;
	static int [] order;
	static ArrayList<ArrayList<Integer>> like;
	static int [] dr = {-1, 1, 0, 0};
	static int [] dc = {0, 0, -1, 1};
	static int ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N+1][N+1];
		order = new int[N*N+1];
		like = new ArrayList<>();
		for (int i = 0; i <= N*N; i++) {
			like.add(new ArrayList<>());
		}
		
		for (int i = 1; i <= N*N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			order[i] = n;
			for (int j = 0; j < 4; j++) {
				like.get(n).add(Integer.parseInt(st.nextToken()));
			}
		}
		
		map[2][2] = order[1];
		
		for (int i = 2; i <= N*N; i++) {
			int n = order[i];
			find(n);
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				solve(i, j);
			}
		}
		
		System.out.println(ans);
		
		

	}

	private static void solve(int r, int c) {
		int idx = map[r][c];
		int likes = 0;
		
		for (int d = 0; d < 4; d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			
			if(!check(nr, nc)) continue;
			
			for(int tmp : like.get(idx)) {
				if(map[nr][nc] == tmp) {
					likes++;
					break;
				}
			}
		}
		
		if(likes == 4) {
			ans += 1000;
		} else if(likes == 3) {
			ans += 100;
		} else if(likes == 2) {
			ans += 10;
		} else if(likes == 1) {
			ans += 1;
		}
		
	}

	private static void find(int n) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if(map[i][j] != 0) continue;
				
				int likes = 0;
				int blanks = 0;
				
				for (int d = 0; d < 4; d++) {
					int nr = i+dr[d];
					int nc = j+dc[d];
					
					if(!check(nr, nc)) continue;
					if(map[nr][nc] == 0) blanks++;
					
					for(int tmp : like.get(n)) {
						if(map[nr][nc] == tmp) {
							likes++;
							break;
						}
					}
				}
				
				pq.add(new Node(i, j, likes, blanks));
			}
		}
		
		Node node = pq.poll();
		map[node.r][node.c] = n;
	}

	private static boolean check(int r, int c) {
		return r>0 && r<=N && c>0 && c<=N;
	}

}
