import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_B5_18409_Counting_Vowels {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		Set<Character> set = new HashSet<>();
		set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
		
		String str = br.readLine();
		for (int i = 0; i < N; i++) {
			char c = str.charAt(i);
			
			if(set.contains(c)) ans++;
		}
		
		System.out.println(ans);
		
	}

}
