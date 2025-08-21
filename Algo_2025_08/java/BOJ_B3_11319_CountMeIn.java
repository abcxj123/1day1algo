import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_B3_11319_CountMeIn {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Character> set = new HashSet<>();
		set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine().toLowerCase();
			
			int ja = 0;
			int mo = 0;
			
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				
				if(c == ' ') continue;
				
				if(set.contains(c)) mo++;
				else ja++;
			}
			
			System.out.println(ja+" "+mo);
		}
		
	}

}
