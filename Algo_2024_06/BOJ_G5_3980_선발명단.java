import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_G5_3980_선발명단 {
	
	static int [][] stats;
	static boolean [] v;
	static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			stats = new int[11][11];
			v = new boolean[11];
			max = 0;
			
			for (int i = 0; i < 11; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 11; j++) {
					stats[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			dfs(0, 0);
			
			sb.append(max+"\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

	private static void dfs(int idx, int sum) {
		if(idx == 11) {
			max = Math.max(max, sum);
			
			return;
		}
		
		for (int i = 0; i < 11; i++) {
			if(v[i] || stats[i][idx] == 0) continue;
			
			v[i] = true;	
			sum += stats[i][idx];
			idx++;
			dfs(idx, sum);
			idx--;
			sum -= stats[i][idx];
			v[i] = false;
			
		}
		
	}

}
