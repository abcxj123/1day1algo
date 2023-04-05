import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_1371_가장많은글자 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int [] cnt = new int[26];
		
		while ((str = br.readLine()) != null) {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(c == ' ') continue;
				else {
					int n = c - 'a';
					cnt[n]++;
				}
			}
		}
		
		int max = -1;
		
		for (int i = 0; i < 26; i++) {
			if(max > cnt[i]) continue;
			int tmp = i + 'a';
			
			char c =  (char)tmp;
			
			if(max == cnt[i]) {
				sb.append(c);
			} else if(max < cnt[i]) {
				max = cnt[i];
				sb.setLength(0);
				sb.append(c);
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
