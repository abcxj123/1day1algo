import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S4_11047_동전 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int idx = -1;
		int cnt = 0;
		
		int [] money = new int[N];
		
		for (int i = 0; i < N; i++) {
			money[i] = Integer.parseInt(br.readLine());
			if(money[i] <= K) {
				idx = i;
			}
		}
		
		for (int i = idx; i >= 0; i--) {
			while(K>=money[i]) {
				K -= money[i];
				cnt++;
			}
			if(K == 0) break;
		}
		
		System.out.println(cnt);

	}

}
