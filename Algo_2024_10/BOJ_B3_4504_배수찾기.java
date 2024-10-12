import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_4504_배수찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) break;
			
			if(n % N == 0) {
				sb.append(n+" is a multiple of "+N+".\n");
			} else {
				sb.append(n+" is NOT a multiple of "+N+".\n");
			}			
		}
		
		if(sb.length() > 0) sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
