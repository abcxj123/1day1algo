import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S4_17266_어두운굴다리 {
	
	static int [] arr;
	static int N, M, ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		arr = new int[M];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = 1;
		int end = N;
		
		while(start <= end) {
			int mid = (start+end) / 2;
			if(possible(mid)) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		
		System.out.println(ans);

	}

	private static boolean possible(int n) {
		int past = 0;
		
		for (int i = 0; i < M; i++) {
			if(arr[i] - n <= past) {
				past = arr[i] + n;
			} else return false;
		}
		return N - past <= 0;
	}

}
