import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_S5_9196_정수직사각형 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> set = new HashSet<>();
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			set.add(str);
		}
		
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			if(set.contains(str)) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
	}

}
