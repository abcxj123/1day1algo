import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_B2_27160_할리갈리 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String S = st.nextToken();
			int X = Integer.parseInt(st.nextToken());
			
			map.put(S, map.getOrDefault(S, 0)+X);
		}
		
		boolean check = false;
		
		for (String s : map.keySet()) {
			if(map.get(s) == 5) {
				check = true;
				break;
			}
		}
		
		if(check) System.out.println("YES");
		else System.out.println("NO");
		
	}

}
