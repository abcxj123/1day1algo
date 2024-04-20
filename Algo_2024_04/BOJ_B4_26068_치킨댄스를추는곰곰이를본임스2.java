import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_26068_치킨댄스를추는곰곰이를본임스2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			int day = Integer.parseInt(str.substring(2, str.length()));
			
			if(day <= 90) ans++;
		}
		
		System.out.println(ans);
		
	}

}
