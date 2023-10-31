import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_B1_1524_세준세비 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			String tmp = br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int [] arr1 = new int[N];
			int [] arr2 = new int[M];
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr1[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				arr2[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(arr1[N-1] < arr2[M-1]) {
				sb.append("B\n");
			} else {
				sb.append("S\n");
			}
			
		}
		
		System.out.println(sb.toString());
		
	}

}
