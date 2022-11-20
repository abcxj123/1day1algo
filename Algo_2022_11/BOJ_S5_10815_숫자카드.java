import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_S5_10815_숫자카드 {
	
	static int N;
	static int [] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
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
			binary(n);
		}
		
		System.out.println(sb.toString());

	}

	private static void binary(int n) {
		int start = 0;
		int end = N-1;
		int mid = -1;
		
		while(start <= end) {
			mid = (start + end) / 2;
			if(arr[mid] < n) {
				start = mid + 1;
			} else if(arr[mid] > n) {
				end = mid - 1;
			} else {
				sb.append("1 ");
				return;
			}
		}
		
		sb.append("0 ");
	}

}
