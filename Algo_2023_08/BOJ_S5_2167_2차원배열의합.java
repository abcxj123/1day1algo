import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_2167_2차원배열의합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int [][] arr = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int K = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken())-1;
			int y1 = Integer.parseInt(st.nextToken())-1;
			int x2 = Integer.parseInt(st.nextToken())-1;
			int y2 = Integer.parseInt(st.nextToken())-1;
			
			int sum = 0;
			
			for (int j = x1; j <= x2; j++) {
				for (int k = y1; k <= y2; k++) {
					sum += arr[j][k];
				}
			}
			
			sb.append(sum+"\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
