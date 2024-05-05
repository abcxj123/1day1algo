import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_B3_26040_특정대문자를소문자로바꾸기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		Set<Character> set = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			char c = st.nextToken().charAt(0);
			set.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(set.contains(c)) {
				sb.append(String.valueOf(c).toLowerCase());
			} else {
				sb.append(c);
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
