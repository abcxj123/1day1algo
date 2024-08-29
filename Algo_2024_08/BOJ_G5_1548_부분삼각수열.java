import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_G5_1548_부분삼각수열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N <= 2) {
			System.out.println(N);
			System.exit(0);
		}
		
		int [] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int max = 0;
		for (int i = 0; i < N-2; i++) {
			int sum = arr[i] + arr[i+1];
			for (int j = N-1; j > i; j--) {
				if(sum > arr[j]) {
					max = Math.max(max, j-i+1);
					break;
				}
			}
		}
		
		System.out.println(max);	
		
	}

}
