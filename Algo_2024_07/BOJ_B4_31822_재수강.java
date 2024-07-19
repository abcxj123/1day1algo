import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_31822_재수강 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().substring(0, 5);
		
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			String str2 = br.readLine().substring(0, 5);
			if(str.equals(str2)) ans++;
		}
		
		System.out.println(ans);
		
	}

}
