import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B4_25881_Electric_Bill {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int fee1 = Integer.parseInt(st.nextToken());
		int fee2 = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append(n+" ");
			
			if(n <= 1000) {
				sb.append(n*fee1+"\n");
			} else {
				int total = fee1*1000 + fee2*(n-1000);
				sb.append(total+"\n");
			}
		}
		
		if(sb.length() > 0) {
			sb.setLength(sb.length()-1);
		}
		System.out.println(sb.toString());
		
	}

}
