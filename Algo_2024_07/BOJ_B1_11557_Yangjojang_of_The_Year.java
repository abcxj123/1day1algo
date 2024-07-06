import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B1_11557_Yangjojang_of_The_Year {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			
			int max = -1;
			String maxS = "";
			
			for (int i = 0; i < N; i++) {				
				StringTokenizer st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				int L = Integer.parseInt(st.nextToken());
				
				if(L > max) {
					max = L;
					maxS = s;
				}
			}
			
			sb.append(maxS+"\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
