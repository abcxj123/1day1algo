import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_B1_19843_수면패턴 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Mon", 0);
		map.put("Tue", 24);
		map.put("Wed", 48);
		map.put("Thu", 72);
		map.put("Fri", 96);
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String start = st.nextToken();
			int startTime = Integer.parseInt(st.nextToken());
			String end = st.nextToken();
			int endTime = Integer.parseInt(st.nextToken());
			
			startTime += map.get(start);
			endTime += map.get(end);
			
			T -= (endTime - startTime);
		}
		
		if(T < 0) {
			System.out.println(0);
		} else if(T > 48) {
			System.out.println(-1);
		} else {
			System.out.println(T);
		}
		
	}

}
