import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B2_20124_모르고리즘회장님추천받습니다 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String name = "";
		int max = 0;
		
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String A = st.nextToken();
			int B = Integer.parseInt(st.nextToken());
			
			if(max < B) {
				name = A;
				max = B;
			} else if(max == B) {
				if(A.compareTo(name) < 0) {
					name = A;
				}
			}
		}
		
		System.out.println(name);
		
	}

}
