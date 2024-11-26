import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_13484_Tarifa {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int ans = X * (N+1);
		
		for (int i = 0; i < N; i++) {
			ans -= Integer.parseInt(br.readLine());
		}
		
		System.out.println(ans);
		
	}

}
