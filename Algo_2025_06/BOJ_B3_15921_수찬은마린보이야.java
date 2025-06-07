import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_15921_수찬은마린보이야 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N == 0) {
			System.out.println("divide by zero");
		}else {
			StringTokenizer st = new StringTokenizer(br.readLine());
		
			for(int i = 0; i < N; i++) {
				Integer.parseInt(st.nextToken());
			}
			
			System.out.println("1.00");
		}

	}

}
