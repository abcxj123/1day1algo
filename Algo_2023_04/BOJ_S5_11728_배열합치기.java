import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_S5_11728_배열합치기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int [] A = new int[N];
		int [] B = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		int aIdx = 0;
		int bIdx = 0;
		
		while(true) {
			if(aIdx == N) {
				for (int i = bIdx; i < M; i++) {
					sb.append(B[i]+" ");
				}
				
				break;
			} else if(bIdx == M) {
				for (int i = aIdx; i < N; i++) {
					sb.append(A[i]+" ");
				}
				
				break;
			}
			
			int a = A[aIdx];
			int b = B[bIdx];
			
			if(a < b) {
				sb.append(a+" ");
				aIdx++;
			} else {
				sb.append(b+" ");
				bIdx++;
			}
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
