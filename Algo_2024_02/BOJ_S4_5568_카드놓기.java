import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_S4_5568_카드놓기 {
	static int N, K;
	static int [] picks, arr;
	static Set<String> set;
	static boolean [] v;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		picks = new int[K];
		arr = new int[N];
		set = new HashSet<String>();
		v = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		back(0);
		
		System.out.println(set.size());
		
	}

	private static void back(int cnt) {
		if(cnt == K) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < K; i++) {
				sb.append(picks[i]);
			}
			
			set.add(sb.toString());
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if(v[i]) continue;
			
			v[i] = true;
			picks[cnt] = arr[i];
			back(cnt+1);
			v[i] = false;
		}
		
	}

}
