import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B2_6246_풍선놀이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		int [] arr = new int[N];
		
		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			
			int L = Integer.parseInt(st.nextToken())-1;
			int I = Integer.parseInt(st.nextToken());
			
			for (int j = L; j < N; j += I) {
				arr[j] = 1;
			}
		}
		
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if(arr[i] == 0) ans++;
		}
		
		System.out.println(ans);
		
	}

}
