import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_S4_26596_황금칵테일 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		
		int M = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int amount = Integer.parseInt(st.nextToken());
			
			if(map.containsKey(name)) {
				map.put(name, map.get(name)+amount);
			} else {
				map.put(name, amount);
			}
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			int value = (int) (entry.getValue() * 1.618);
			if(map.containsValue(value)) {
				if(value == entry.getValue()) {
					if(set.contains(value)) {
						System.out.println("Delicious!");
						System.exit(0);
					} else {
						set.add(value);
					}
				} else {
					System.out.println("Delicious!");
					System.exit(0);
				}
			}
			
		}
		
		System.out.println("Not Delicious...");

	}

}
