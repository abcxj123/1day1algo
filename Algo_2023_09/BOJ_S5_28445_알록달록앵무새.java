import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_S5_28445_알록달록앵무새 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				String str = st.nextToken();
				if(set.contains(str)) continue;
				set.add(str);
			}
			
		}
		
		List<String> list = new ArrayList<>(set);
		Collections.sort(list);
		int size = list.size();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				sb.append(list.get(i)+" "+list.get(j)+"\n");
			}
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
