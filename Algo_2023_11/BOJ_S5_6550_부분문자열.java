import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_6550_부분문자열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str;
		
		outer:
			while((str = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(str);
				
				String str1 = st.nextToken();
				String str2 = st.nextToken();
				
				int l = str1.length();
				int idx = 0;
				
				for (int i = 0; i < str2.length(); i++) {
					char c = str2.charAt(i);
					if(c == str1.charAt(idx)) {
						idx++;
					}
					
					if(idx >= l) {
						sb.append("Yes\n");
						continue outer;
					}
				}
				
				sb.append("No\n");
				
			}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
