import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B4_30999_민주주의 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				if(str.charAt(j) == 'O') cnt++;
			}
			
			if(cnt > M/2) ans++;
			
		}
		
		System.out.println(ans);
		
	}

}
