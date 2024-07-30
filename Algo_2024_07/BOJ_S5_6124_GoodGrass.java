import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ_S5_6124_GoodGrass {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int [][] arr = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max = -1;
		int maxR = 0;
		int maxC = 0;
		
		
		for (int i = 0; i < N-2; i++) {
			for (int j = 0; j < M-2; j++) {
				int sum = 0;
				for (int k = i; k < i+3; k++) {
					for (int l = j; l < j+3; l++) {
						sum += arr[k][l];
					}
				}
				if(sum > max) {
					max = sum;
					maxR = i+1;
					maxC = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(maxR+" "+maxC);
		
	}

}
