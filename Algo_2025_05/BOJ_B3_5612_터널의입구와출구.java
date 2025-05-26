import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_5612_터널의입구와출구 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int max = M;
		
		boolean check = false;
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			M = M + a - b;
			
			if(M < 0) {
				check = true;
			}
			
			max = Math.max(max, M);
			
		}
		
		if(check) System.out.println(0);
		else System.out.println(max);
		
	}

}
