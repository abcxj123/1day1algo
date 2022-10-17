import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BOJ_S4_1764_듣보잡 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		TreeMap<String, Boolean> map = new TreeMap<>();
		ArrayList<String> list = new ArrayList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), false);
		}
		
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			if(map.containsKey(str)) {
				map.put(str, true);
			}
		}
		
		int size = map.size();
		
		for (int i = 0; i < size; i++) {
			String key = map.firstKey();
			if(map.get(key) == true) {
				list.add(key);
			}
			map.remove(key);
		}
		
		Collections.sort(list);
		
		int ans = list.size();
		
		System.out.println(ans);
		
		for (int i = 0; i < ans; i++) {
			System.out.println(list.get(i));
		}

	}

}
