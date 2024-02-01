import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_S4_20937_떡국 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(map.containsKey(n)) {
				int value = map.get(n)+1;
				map.put(n, value);
				max = Math.max(max, value);
			} else {
				map.put(n, 1);
				max = Math.max(max, 1);
			}
		}
		
		System.out.println(max);
		
	}

}
