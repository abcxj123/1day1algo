import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S3_17204_죽음의게임 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int [] arr = new int[N];
		boolean [] v = new boolean[N];
		v[0] = true;
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}	
		
		int nextIdx = arr[0];
		int ans = 0;
		
		while(true) {
			ans++;
			
			if(v[nextIdx]) {
				ans = -1;
				break;
			}
			
			if(nextIdx == M) {
				break;
			}
			
			v[nextIdx] = true;
			
			int n = arr[nextIdx];
			nextIdx = n;
		}
		
		System.out.println(ans);
		
		
	}

}
