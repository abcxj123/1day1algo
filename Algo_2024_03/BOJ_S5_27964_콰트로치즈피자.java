import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_S5_27964_콰트로치즈피자 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<String> set = new HashSet<String>();
		
		int cnt = 0 ;
		
		for (int i = 0; i < N; i++) {
			String str = st.nextToken();
			
			if(set.contains(str)) continue;
			set.add(str);
			
			int length = str.length();
			
			
			if(length >= 6 && str.substring(length-6, length).equals("Cheese")) cnt++;
			
			if(cnt >= 4) break;
		}
		
		if(cnt == 4) {
			System.out.println("yummy");
		} else {
			System.out.println("sad");
		}
		
	}

}
