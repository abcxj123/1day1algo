import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_24510_시간복잡도를배운도도 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int max = 0;
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			
			s = s.replaceAll("for", "A");
			s = s.replaceAll("while", "B");
			
			int cnt = 0;
			
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				
				if(c == 'A' || c == 'B') cnt++;
			}
			
			max = Math.max(max, cnt);
			
		}
		
		System.out.println(max);
		
	}

}
