import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_B2_20528_끝말잇기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Set<Character> set = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			String s = st.nextToken();
			
			set.add(s.charAt(0));
			set.add(s.charAt(s.length()-1));
		}
		
		if(set.size() == 1) System.out.println(1);
		else System.out.println(0);
		
	}

}
