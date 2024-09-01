import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_B4_31428_엘리스트랙매칭 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			String s = st.nextToken();
			
			map.putIfAbsent(s, 0);
			map.put(s, map.get(s)+1);
		}
		
		String s = br.readLine();
		map.putIfAbsent(s, 0);
		
		System.out.println(map.get(s));

	}

}
