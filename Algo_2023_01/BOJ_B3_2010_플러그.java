import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_2010_플러그 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			cnt += Integer.parseInt(br.readLine())-1;
		}
		
		System.out.println(cnt+1);

	}

}
