import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B5_23235_Sorting {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int idx = 1;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			
			if(N == 0) break;
			
			for (int i = 0; i < N; i++) {
				st.nextToken();
			}
			
			System.out.println("Case "+(idx++)+": Sorting... done!");
			
		}

	}

}
