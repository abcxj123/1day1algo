import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_S4_1920_수찾기 {
	static int [] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
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
			if(find(n)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		
	}

	private static boolean find(int target) {
		int start = 0;
		int end = arr.length-1;
		int mid = (start+end)/2;
		
		while(start <= end) {
			if(arr[mid] == target) {
				return true;
			} else if(arr[mid] <= target) {
				start = mid+1;
			} else {
				end = mid-1;
			}
			mid = (start+end)/2;
		}
		
		return false;
	}

}
