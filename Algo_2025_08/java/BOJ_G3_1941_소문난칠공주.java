import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class BOJ_G3_1941_소문난칠공주 {
	static int ans;
	static boolean [] girls, v;
	static int [] picks;
	static int [] dr = {-1, 0, 1, 0};
	static int [] dc = {0, 1, 0, -1};
	
	// 1. 조합을 사용해서 25개중에 7개를 선택
	// 2. 다솜파가 4명 이하면 return
	// 3. 서로 연결되어 있는지 확인하고, 되어있으면 ans++;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		girls = new boolean[25];
		v = new boolean[25];
		picks = new int[7];
		
		for (int i = 0; i < 5; i++) {
			String s = br.readLine();
			for (int j = 0; j < 5; j++) {
				girls[i*5+j] = s.charAt(j) == 'S' ? true : false;
			}
		}
		
		combi(0, 0);
		
		System.out.println(ans);
		
	}

	private static void combi(int start, int depth) {
		if(depth == 7) {
			int cnt = 0;
			
			for (int n : picks) {
				if(girls[n]) cnt++;
			}
			
			if(cnt >= 4) isConnected();
			
			return;
		}
		
		for (int i = start; i < 25; i++) {
			if(v[i]) continue;
			
			v[i] = true;
			picks[depth] = i;
			combi(i+1, depth+1);
			v[i] = false;
			
		}
		
	}

	private static void isConnected() {
		Set<Integer> set = new HashSet<>();
		for (int idx : picks) set.add(idx);
		
		Queue<Integer> q = new ArrayDeque<>();
		q.add(picks[0]);
		boolean [] v2 = new boolean[25];
		v2[picks[0]] = true;
		
		int cnt = 1;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			int r = cur / 5;
			int c = cur % 5;
			
			for (int d = 0; d < 4; d++) {
				int nr = r+dr[d];
				int nc = c+dc[d];
				
				if(!check(nr, nc)) continue;
				
				int nextIdx = nr*5+nc;
				
				if(!set.contains(nextIdx) || v2[nextIdx]) continue;
				
				cnt++;
				v2[nextIdx] = true;
				q.add(nextIdx);
				
			}
			
		}
		
		if(cnt == 7) ans++;
		
	}

	private static boolean check(int r, int c) {
		return r>=0 && r<5 && c>=0 && c<5;
	}

}
