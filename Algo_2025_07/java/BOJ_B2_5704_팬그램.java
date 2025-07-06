import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_B2_5704_팬그램 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Set<Character> set = new HashSet<>();
		
		while(true) {
			String [] arr = br.readLine().split(" ");
			
			if(arr[0].equals("*")) break;
			
			for(String s : arr) {
				for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					
					if(c >= 'a' && c<= 'z') set.add(c);
				}
			}
			
			if(set.size() == 26) sb.append("Y\n");
			else sb.append("N\n");
			
			set.clear();
		}
		
		if(sb.length() > 0) sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
