import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S4_1895_필터 {
	static int T, ans;
	static int [][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		map = new int[R][C];
		
		for (int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < C; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < R-2; i++) {
			for (int j = 0; j < C-2; j++) {
				check(i, j);
			}
		}
		
		System.out.println(ans);
		
	}

	private static void check(int r, int c) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = r; i < r+3; i++) {
			for (int j = c; j < c+3; j++) {
				list.add(map[i][j]);
			}
		}
		
		Collections.sort(list);
		
		int n = list.get(4);
		
		if(n >= T) ans++;
		
	}

}
