import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_S5_9237_이장님초대 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Integer [] arr = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		int ans = 0;
		int cnt = 2;
		
		for (int i = 0; i < N; i++) {
			int n = arr[i];
			ans = Math.max(ans, n+cnt);
			cnt++;
		}
		
		System.out.println(ans);
		
		
	}

}
