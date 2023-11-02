import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_2740_행렬곱셈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int [][] arr1 = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		int N2 = Integer.parseInt(st.nextToken());
		int M2 = Integer.parseInt(st.nextToken());
		
		int [][] arr2 = new int[N2][M2];
		
		for (int i = 0; i < N2; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M2; j++) {
				arr2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int [][] ans = new int[N][M2];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M2; j++) {
				int sum = 0;
				for (int k = 0; k < M; k++) {
					sum += arr1[i][k] * arr2[k][j];
				}
				ans[i][j] = sum;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M2; j++) {
				sb.append(ans[i][j]+" ");
			}
			sb.setLength(sb.length()-1);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
	}

}
