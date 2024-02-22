import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_13717_포켓몬GO {
	
	// 33 12 -> 31 10 -> 21 11 1 / 3번
	// 42 12 -> 40 10 -> 30 20 10 0 / 4번
	// 47 12 -> 45 10 -> 35 25 15 5 / 4번
	// 71 25 -> 69 23 -> 46 23 0 / 3번
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		int max = -1;
		String most = null;
		
		for (int i = 0; i < N; i++) {
			String name = br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int K = Integer.parseInt(st.nextToken())-2;
			int M = Integer.parseInt(st.nextToken())-2;
			
			int res = M / K;
			if(res > max) {
				most = name;
				max = res;
			}
			
			ans += res;
		}
		
		System.out.println(ans);
		System.out.println(most);
		
	}

}
