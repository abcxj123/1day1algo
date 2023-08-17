import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B1_17247_택시거리 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [][] arr = new int[2][2];
		int idx = 0;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int n = Integer.parseInt(st.nextToken());
				if(n == 1) {
					arr[idx][0] = i;
					arr[idx++][1] = j;
				}
			}
		}
		
		int ans = Math.abs(arr[1][0] - arr[0][0]) + Math.abs(arr[1][1] - arr[0][1]);
		System.out.println(ans);
		
	}

}
