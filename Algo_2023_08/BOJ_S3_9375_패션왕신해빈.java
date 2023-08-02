import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_S3_9375_패션왕신해빈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			Map<String, Integer> map = new HashMap<>();
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				String tmp = st.nextToken();
				String type = st.nextToken();
				
				if(map.containsKey(type)) {
					map.put(type, map.get(type)+1);
				} else {
					map.put(type, 1);
				}
			}
			
			int ans = 1;
			
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				ans *= (entry.getValue()+1);
			}
			
			sb.append((ans-1)+"\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
