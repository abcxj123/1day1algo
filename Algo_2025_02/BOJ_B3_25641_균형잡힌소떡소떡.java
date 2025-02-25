import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_25641_균형잡힌소떡소떡 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int s = 0;
		int t = 0;
		
		for (int i = 0; i < N; i++) {
			char c = str.charAt(i);
			
			if(c == 's') s++;
			else t++;
		}
		
		int idx = -1;
		
		for (int i = 0; i < N; i++) {
			if(s == t) {
				idx = i;
				break;
			}
			
			char c = str.charAt(i);
			
			if(c == 's') s--;
			else t--;
		}
		
		System.out.println(str.substring(idx));
		
		
	}

}
