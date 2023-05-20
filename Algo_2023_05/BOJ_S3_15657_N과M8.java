import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_S3_15657_N과M8 {
	static int N, R;
	static int [] arr, pick;
	static boolean [] v;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		arr = new int[N];
		pick = new int[R];
		v = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		combi(0, 0);
	}

	private static void combi(int start, int cnt) {
		if(cnt == R) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < R; i++) {
				sb.append(pick[i]+" ");
			}
			sb.setLength(sb.length()-1);
			System.out.println(sb.toString());
			
			return;
		}
		
		for (int i = start; i < N; i++) {
			pick[cnt] = arr[i];
			combi(i, cnt+1);
		}
		
	}

}
