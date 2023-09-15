import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_2774_아름다운수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			boolean [] arr = new boolean[10];
			int cnt = 0;
			
			String str = br.readLine();
			
			for (int i = 0; i < str.length(); i++) {
				int n = str.charAt(i) - '0';
				arr[n] = true;
			}
			
			for (int i = 0; i < 10; i++) {
				if(arr[i]) cnt++;
			}
			
			sb.append(cnt+"\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
