import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S4_9372_상근이의여행 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			boolean [] v = new boolean[N+1];
			int [][] map = new int[N+1][N+1];
			int cnt = 0;
			
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				map[a][b] = 1;
				map[b][a] = 1;
			}
			
			Queue<Integer> q = new LinkedList<Integer>();
			v[1] = true;
			q.add(1);
			
			while(!q.isEmpty()) {
				cnt++;
				int cur = q.poll();
				for (int i = 1; i <= N; i++) {
					if(map[cur][i] == 1 && !v[i]) {
						v[i] = true;
						q.add(i);
					}
				}
			}
			
			System.out.println(cnt-1);
			
		}

	}

}
