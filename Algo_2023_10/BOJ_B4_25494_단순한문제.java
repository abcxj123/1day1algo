import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B4_25494_단순한문제 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int ans = 0;
			
			for (int x = 1; x <= a; x++) {
				for (int y = 1; y <= b; y++) {
					for (int z = 1; z <= c; z++) {
						if(x%y == y%z && y%z == z%x) {
							ans++;
						}
					}
				}
			}
			
			System.out.println(ans);
			
		}
		
	}

}
