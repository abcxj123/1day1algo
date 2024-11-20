import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_10180_ShipSelection {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			int cnt = 0;
			
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				
				int v = Integer.parseInt(st.nextToken());
				double f = Double.parseDouble(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				
				if(v*f/c >= D) cnt++;
			}
			
			sb.append(cnt+"\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
