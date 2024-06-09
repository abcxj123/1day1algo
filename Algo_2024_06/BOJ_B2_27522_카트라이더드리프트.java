import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_B2_27522_카트라이더드리프트 {
	static class Cart implements Comparable<Cart> {
		int time;
		char team;
		
		public Cart(int time, char team) {
			this.time = time;
			this.team = team;
		}

		@Override
		public int compareTo(Cart o) {
			return Integer.compare(this.time, o.time);
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Cart [] arr = new Cart[8];
		
		for (int i = 0; i < 8; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String [] tmp = st.nextToken().split(":");
			char team = st.nextToken().charAt(0);
			
			int time = Integer.parseInt(tmp[0])*60000+Integer.parseInt(tmp[1])*1000+Integer.parseInt(tmp[2]);
			arr[i] = new Cart(time, team);
			
		}
		
		Arrays.sort(arr);
		
		Map<Character, Integer> map = new HashMap<>();
		map.put('R', 0);
		map.put('B', 0);
		
		map.put(arr[0].team, map.get(arr[0].team)+10);
		map.put(arr[1].team, map.get(arr[1].team)+8);
		map.put(arr[2].team, map.get(arr[2].team)+6);
		map.put(arr[3].team, map.get(arr[3].team)+5);
		map.put(arr[4].team, map.get(arr[4].team)+4);
		map.put(arr[5].team, map.get(arr[5].team)+3);
		map.put(arr[6].team, map.get(arr[6].team)+2);
		map.put(arr[7].team, map.get(arr[7].team)+1);
	
		if(map.get('R') > map.get('B')) {
			System.out.println("Red");
		} else {
			System.out.println("Blue");
		}
		
		
	}

}
