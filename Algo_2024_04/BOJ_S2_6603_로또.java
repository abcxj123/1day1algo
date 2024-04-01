import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_S2_6603_로또 {
	static int K;
	static int [] nums, picks;
	static boolean [] v;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			K = Integer.parseInt(st.nextToken());
			
			if(K == 0) break;
			
			nums = new int[K];
			v = new boolean[K];
			picks = new int[6];
			
			for (int i = 0; i < K; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(nums);
			
			combi(0, 0);
			
			sb.append('\n');
			
		}
		
		if(sb.length() > 0) {
			sb.setLength(sb.length()-1);
		}
		
		System.out.println(sb.toString());
		
	}

	private static void combi(int start, int cnt) {
		if(cnt == 6) {
			for (int i = 0; i < 6; i++) {
				sb.append(picks[i]+" ");
			}
			
			sb.setLength(sb.length()-1);
			sb.append('\n');
			
			return;
		}
		
		for (int i = start; i < K; i++) {
			if(!v[i]) {
				v[i] = true;
				picks[cnt] = nums[i];
				combi(i+1, cnt+1);
				v[i] = false;
			}
		}
		
		
	}

}
