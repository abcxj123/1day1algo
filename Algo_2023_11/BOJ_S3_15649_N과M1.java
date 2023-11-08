import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S3_15649_N과M1 {
	static int N, M;
	static int [] picks;
	static boolean [] v;
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		picks = new int[M];
		v = new boolean[N+1];
		sb = new StringBuilder();
		
		perm(0);
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

	private static void perm(int cnt) {
		if(cnt == M) {
			for (int i = 0; i < M; i++) {
				sb.append(picks[i]+" ");
			}
			sb.setLength(sb.length()-1);
			sb.append("\n");
			
			return;
		}
		
		for (int i = 1; i <= N; i++) {
			if(!v[i]) {
				v[i] = true;
				picks[cnt] = i;
				perm(cnt+1);
				v[i] = false;
			}
		}
		
	}

}
