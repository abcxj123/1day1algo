import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_S5_25325_학생인기도측정 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			map.put(st.nextToken(), 0);
		}
		
		for (int i = 0; i < N; i++) {
			String [] arr = br.readLine().split(" ");
			
			for (int j = 0; j < arr.length; j++) {
				String str = arr[j];
				map.put(str, map.get(str)+1);
			}
			
		}
		
		List<String> keySet = new ArrayList<>(map.keySet());
		
		keySet.sort((o1, o2) -> {
            if(map.get(o1) == map.get(o2))
                return o1.compareTo(o2);
            else
                return map.get(o2).compareTo(map.get(o1));
        });
		
		
		for (String key : keySet) {
			System.out.println(key+" "+map.get(key));
		}
		
	}

}
