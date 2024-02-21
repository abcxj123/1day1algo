import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_S5_15720_카우버거 {
	static int before, after;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		int min = Math.min(B, Math.min(C, D));
		
		cal(br, B, min);
		cal(br, C, min);
		cal(br, D, min);
		
		System.out.println(before);
		System.out.println(after);
		
	}

	private static void cal(BufferedReader br, int n, int min) throws IOException {
		Integer [] arr = new Integer[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (int i = 0; i < min; i++) {
			before += arr[i];
			after += arr[i]*0.9;
		}
		
		for (int i = min; i < n; i++) {
			before += arr[i];
			after += arr[i];
		}
	}

}
