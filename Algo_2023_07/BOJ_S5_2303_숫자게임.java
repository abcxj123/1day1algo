import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_2303_숫자게임 {
	static int [][] nums;
	static int [] max, pick;
	static boolean [] v;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		nums = new int[N][5];
		max = new int[N];
		pick = new int[3];
		v = new boolean[5];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				nums[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < N; i++) {
			combi(i, 0, 0);
		}
		
		int maxIdx = -1;
		int maxNum = 0;
		
		for (int i = 0; i < N; i++) {
			if(max[i] >= maxNum) {
				maxIdx = i;
				maxNum = max[i];
			}
		}
		
		System.out.println(maxIdx+1);
		
	}

	private static void combi(int N, int start, int cnt) {
		if(cnt == 3) {
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				sum += pick[i];
			}
			
			int n = (sum % 10);
			max[N] = Math.max(max[N], n);
			
			return;
		}
		
		for (int i = start; i < 5; i++) {
			if(!v[i]) {
				v[i] = true;
				pick[cnt] = nums[N][i];
				combi(N, start+1, cnt+1);
				v[i] = false;
			}
		}
		
	}

}
