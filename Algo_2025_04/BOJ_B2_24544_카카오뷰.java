import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B2_24544_카카오뷰 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[N];
		int total = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			total += arr[i];
		}
		
		int sum = 0;
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 0) sum += arr[i];
		}
		
		System.out.println(total);
		System.out.println(sum);
		
	}

}
