import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B1_4344_평균은넘겠지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			double score = 0.0;
			int [] arr = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				score += arr[i];
			}
			
			score /= N;
			
			double cnt = 0;
			
			for (int i = 0; i < N; i++) {
				if(arr[i] > score) cnt++;
			}
			
			System.out.print(String.format("%.3f", cnt/N*100.0));
			System.out.println("%");
		}

	}

}
