import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_S4_26069_붙임성좋은총총이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<>();
		set.add("ChongChong");
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str1 = st.nextToken();
			String str2 = st.nextToken();
			
			if(set.contains(str1) && !set.contains(str2)) {
				set.add(str2);
			} else if(set.contains(str2) && !set.contains(str1)) {
				set.add(str1);
			}
		}
		
		System.out.println(set.size());
		
		
	}

}
