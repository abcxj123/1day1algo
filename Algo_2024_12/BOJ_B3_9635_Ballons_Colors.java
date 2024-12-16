import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_9635_Ballons_Colors {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			boolean easy = false;
			boolean hard = false;
			
			st = new StringTokenizer(br.readLine());
			
			if(Integer.parseInt(st.nextToken()) == X) easy = true;
			for (int i = 0; i < N-2; i++) {
				st.nextToken();
			}
			if(Integer.parseInt(st.nextToken()) == Y) hard = true;
			
			if(easy && hard) sb.append("BOTH\n");
			else if(easy && !hard) sb.append("EASY\n");
			else if(!easy && hard) sb.append("HARD\n");
			else sb.append("OKAY\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
