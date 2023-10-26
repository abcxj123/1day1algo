import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BOJ_S5_11235_Polling {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			} else {
				map.put(str, 1);
			}
		}
		
		List<String> list = new ArrayList<>();
		int max = -1;
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() > max) {
				list.clear();
				list.add(entry.getKey());
				max = entry.getValue();
			} else if(entry.getValue() == max) {
				list.add(entry.getKey());
			}
		}
		
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		
		for (String str : list) {
			sb.append(str+"\n");
		}
		
		System.out.println(sb.toString());
		
	}

}
