import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_25640_MBTI {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			String mbti = br.readLine();
			if(str.equals(mbti)) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
	}

}
