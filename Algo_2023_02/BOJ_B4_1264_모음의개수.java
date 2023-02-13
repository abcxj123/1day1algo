import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_1264_모음의개수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			if(str.equals("#")) break;
			
			int cnt = 0;
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(c >= 'A' && c<= 'Z') c = Character.toLowerCase(c);
				
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') cnt++;
			}
			
			sb.append(cnt).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
