import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_11008_복붙의달인 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			String key = st.nextToken();
			int length = key.length();
			int cnt = 0;
			
			while(str.length() > 0 || cnt > 10000) {
				if(str.startsWith(key)) {
					str = str.substring(length, str.length());
				} else {
					str = str.substring(1, str.length());
				}
				
				cnt++;
				
			}
			
			System.out.println(cnt);
			
		}
	}

}
