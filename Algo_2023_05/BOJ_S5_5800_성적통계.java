import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_S5_5800_성적통계 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int K = Integer.parseInt(st.nextToken());
			
			int [] arr = new int[K];
			
			for (int i = 0; i < K; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			int min = arr[0];
			int max = arr[K-1];
			int gap = 0;
			
			int past = arr[0];
			for (int i = 1; i < K; i++) {
				gap = Math.max(gap, Math.abs(past - arr[i]));
				past = arr[i];
			}
			
			System.out.println("Class "+t);
			System.out.println("Max "+max+", Min "+min+", Largest gap "+gap);
		}
	}

}
