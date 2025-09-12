import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B2_22966_가장쉬운문제를찾는문제 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int min = 5;
		String ans = null;
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			int level = Integer.parseInt(st.nextToken());
			
			if(level < min) {
				ans = name;
				min = level;
			}
		}
		
		System.out.println(ans);
		
	}

}
