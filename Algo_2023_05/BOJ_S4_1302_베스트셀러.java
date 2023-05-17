import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BOJ_S4_1302_베스트셀러 {
	static class Book implements Comparable<Book> {
		String name;
		int cnt;
		
		public Book(String name, int cnt) {
			this.name = name;
			this.cnt = cnt;
		}

		@Override
		public int compareTo(Book o) {
			if(this.cnt != o.cnt) {
				return Integer.compare(o.cnt, this.cnt);
			} else {
				return this.name.compareTo(o.name);
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		List<Book> list = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			if(map.get(str) != null) {
				int cnt = map.get(str);
				map.put(str, cnt+1);
			} else {
				map.put(str, 1);
			}
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			
			list.add(new Book(key, value));
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0).name);
		
	}

}
