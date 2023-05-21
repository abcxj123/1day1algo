import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_S4_1920_수찾기 {
	static int N;
	static int [] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < M; i++) {
			int n = Integer.parseInt(st.nextToken());
			sb.append(find(n)+"\n");
		}
		
		System.out.println(sb.toString());
		
	}

	private static int find(int n) {
		int start = 0;
		int end = N-1;
		int mid = (start + end) / 2;
		
		while(start <= end) {
			if(n == arr[mid]) {
				return 1;
			} else if(n < arr[mid]) {
				end = mid - 1;
			} else if(n > arr[mid]) {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		
		return 0;
		
	}

}
