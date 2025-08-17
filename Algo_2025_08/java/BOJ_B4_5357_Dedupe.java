import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_5357_Dedupe {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			
			char past = '0';
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				
				if(past != c) {
					System.out.print(c);
					past = c;
				}
			}
			
			System.out.println();
			
		}
		
	}

}
