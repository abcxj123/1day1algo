import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_5555_반지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String ans = br.readLine();
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			StringBuilder sb = new StringBuilder(str);
			sb.append(str);
			
			if(sb.toString().contains(ans)) cnt++;
		}
		
		System.out.println(cnt);

	}

}
