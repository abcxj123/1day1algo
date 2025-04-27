import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_4435_중간계전쟁 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int gan = 0;
			int sa = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			gan += Integer.parseInt(st.nextToken());
			gan += Integer.parseInt(st.nextToken())*2;
			gan += Integer.parseInt(st.nextToken())*3;
			gan += Integer.parseInt(st.nextToken())*3;
			gan += Integer.parseInt(st.nextToken())*4;
			gan += Integer.parseInt(st.nextToken())*10;
			
			st = new StringTokenizer(br.readLine());
			
			sa += Integer.parseInt(st.nextToken());
			sa += Integer.parseInt(st.nextToken())*2;
			sa += Integer.parseInt(st.nextToken())*2;
			sa += Integer.parseInt(st.nextToken())*2;
			sa += Integer.parseInt(st.nextToken())*3;
			sa += Integer.parseInt(st.nextToken())*5;
			sa += Integer.parseInt(st.nextToken())*10;
			
			sb.append("Battle "+t+": ");
			
			if(gan > sa) sb.append("Good triumphs over Evil\n");
			else if(gan < sa) sb.append("Evil eradicates all trace of Good\n");
			else sb.append("No victor on this battle field\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
		
	}

}
