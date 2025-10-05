import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_B1_31562_전주듣고노래맞히기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, ArrayList<String>> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			st.nextToken();
			String name = st.nextToken();
			String song = "";
			
			for (int j = 0; j < 3; j++) {
				song += st.nextToken();
			}
			
			while (st.hasMoreTokens()) {
				st.nextToken();
			}
			
			if(!map.containsKey(song)) {
				map.put(song, new ArrayList<>());
			}
			
			map.get(song).add(name);
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			String song = "";
			
			while(st.hasMoreTokens()) {
				song += st.nextToken();
			}
			
			if(!map.containsKey(song)) {
				sb.append("!\n");
			} else if(map.get(song).size() >= 2) {
				sb.append("?\n");
			} else {
				sb.append(map.get(song).get(0)+"\n");
			}
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
