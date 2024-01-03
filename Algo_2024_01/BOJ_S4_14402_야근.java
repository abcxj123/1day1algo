import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ_S4_14402_야근 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int q = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		
		int ans = 0;
		
		for (int i = 0; i < q; i++) {
			String [] arr = br.readLine().split(" ");
			String name = arr[0];
			String type = arr[1];
			
			if(type.equals("+")) {
				if(!map.containsKey(name)) {
					map.put(name, 1);
				} else {
					map.put(name, map.get(name)+1);
				}
			} else if(type.equals("-")) {
				if(!map.containsKey(name)) {
					ans++;
				} else {
					map.put(name, map.get(name)-1);
					if(map.get(name) == 0) {
						map.remove(name);
					}
				}
			}
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			ans += entry.getValue();
		}
		
		System.out.println(ans);
		
	}

}
