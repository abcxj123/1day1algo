import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_B5_10809_알파벳찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] idx = new int[26];
		Arrays.fill(idx, -1);
		
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(idx[c-'a'] == -1) {
				idx[c-'a'] = i;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(idx[i]+" ");
		}

	}

}
