import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_11006_남욱이의닭장 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int odd = 2*M-N;
			
			sb.append(odd+" "+(M-odd)+"\n");
		}
		
		if(sb.length()>0) {
			sb.setLength(sb.length()-1);
		}
		System.out.println(sb.toString());
		
	}

}
