import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S4_2847_게임을만든동준이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int [] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int ans = 0;
		
		for (int i = N-2; i >= 0; i--) {
			int past = arr[i+1];
			int now = arr[i];
			
			if(now >= past) {
				int tmp = past - 1;
				ans += (now - tmp);
				arr[i] = tmp;
			}
		}
		
		System.out.println(ans);
	}

}
