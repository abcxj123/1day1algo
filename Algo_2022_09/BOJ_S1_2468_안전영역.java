import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S1_2468_안전영역 {

    static int N;
    static int [][] map;
    static boolean [][] v;
    static int [] dr = {-1, 1, 0, 0}; // 상하좌우
    static int [] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        int max = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for (int i = 0; i <= 100; i++) {
        	v = new boolean[N][N];
        	 max = Math.max(max, bfs(i));
		}
       
        System.out.println(max);

    }

    private static int bfs(int n) {
    	int ans = 0;
    	
    	for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				if(map[r][c] <= n || v[r][c]) continue;
				
		        Queue<int[]> q = new LinkedList<>();
		        v[r][c] = true;
		        q.add(new int[] {r, c});

		        while(!q.isEmpty()) {
		            int [] cur = q.poll();

		            for (int d = 0; d < 4; d++) {
		                int nr = cur[0]+dr[d];
		                int nc = cur[1]+dc[d];
		                
		                if(check(nr, nc) && !v[nr][nc] && map[nr][nc] > n) {
		                	v[nr][nc] = true;
		                	q.add(new int[] {nr, nc});
		                }

		            }

		        }
		        
		        ans++;
				
			}
		}
    	
    	return ans;
    }

	private static boolean check(int r, int c) {
		return r>=0 && r<N && c>=0 && c<N;
	}

}
