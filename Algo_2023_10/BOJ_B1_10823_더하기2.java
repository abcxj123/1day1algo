import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_10823_더하기2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		int ans = 0;
		
		while((str = br.readLine()) != null) {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(c == ',') {
					int n = Integer.parseInt(sb.toString());
					ans += n;
					sb.setLength(0);
				} else {
					sb.append(c);
				}
			}
			
		}
		
		ans += Integer.parseInt(sb.toString());
		
		System.out.println(ans);
		
	}

}
