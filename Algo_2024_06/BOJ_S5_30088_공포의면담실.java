import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_S5_30088_공포의면담실 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long ans = 0;
		
		int [] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			for (int j = 0; j < a; j++) {
				arr[i] += Integer.parseInt(st.nextToken());
			}
			
		}
		
		Arrays.sort(arr);
		
		long past = 0;
		
		for (int i = 0; i < N; i++) {
			ans += arr[i] + past;
			past += arr[i];
		}
		
		System.out.println(ans);
		
	}

}
