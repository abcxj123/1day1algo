import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_B2_7600_문자가몇갤까 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine().toLowerCase();
			
			if(str.equals("#")) break;
			
			Set<Character> set = new HashSet<>();
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if(c >= 'a' && c <= 'z') {
					set.add(c);
				}
			}
			
			sb.append(set.size()+"\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
