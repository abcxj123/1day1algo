import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B1_17224_APC는왜서브태스크대회가되었을까 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int easy = 0;
		int hard = 0;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(b <= L) {
				hard++;
			} else if(a <= L) {
				easy++;
			}
			
		}
		
		int ans = 0;
		if(K < hard) {
			ans += K * 140;
			K = 0;
		} else {
			ans += hard * 140;
			K -= hard;
		}
		
		if(K < easy) {
			ans += K * 100;
		} else {
			ans += easy * 100;
		}
		
		System.out.println(ans);
		
	}

}
