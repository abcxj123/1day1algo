import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_S3_20920_영단어암기는괴로워 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			if (str.length() < M)
				continue;

			map.putIfAbsent(str, 0);
			map.put(str, map.get(str) + 1);
		}

		List<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list, (o1, o2) -> {
			int val1 = map.get(o1);
			int val2 = map.get(o2);

			if (val1 != val2) {
				return Integer.compare(val2, val1);
			} else if (o1.toString().length() != o2.toString().length()) {
				return Integer.compare(o2.toString().length(), o1.toString().length());
			} else {
				return o1.toString().compareTo(o2.toString());
			}
		});

		StringBuilder sb = new StringBuilder();

		for (String str : list) {
			sb.append(str).append('\n');
		}

		if (sb.length() > 0) {
			sb.setLength(sb.length()-1);
		}
		
		System.out.println(sb.toString());

	}

}
