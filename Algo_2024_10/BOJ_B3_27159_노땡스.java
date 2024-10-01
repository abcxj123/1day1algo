import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_B3_27159_노땡스 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		int sum = arr[0];
		int past = arr[0];
		
		for (int i = 1; i < N; i++) {
			int n = arr[i];
			
			if(n != past + 1) {
				sum += n;
			}
			
			past = n;
			
		}
		
		System.out.println(sum);
		
	}

}
