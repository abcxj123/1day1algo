import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_13222_Matches {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		double len = Math.sqrt(W*W+H*H);
		
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n <= len) System.out.println("YES");
			else System.out.println("NO");
		}
		
	}

}
