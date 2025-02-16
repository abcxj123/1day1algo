import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ_B4_28249_Chili_Peppers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Poblano", 1500);
		map.put("Mirasol", 6000);
		map.put("Serrano", 15500);
		map.put("Cayenne", 40000);
		map.put("Thai", 75000);
		map.put("Habanero", 125000);
		
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			ans += map.get(s);
		}
		
		System.out.println(ans);
		
	}

}
