import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_15702_중간고사채점 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] scores = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
		}

		int maxIdx = -1;
		int max = -1;

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int idx = Integer.parseInt(st.nextToken());
			int sum = 0;

			for (int j = 0; j < N; j++) {
				char c = st.nextToken().charAt(0);
				if (c == 'O') {
					sum += scores[j];
				}
			}

			if (sum > max || (sum == max && idx < maxIdx)) {
				maxIdx = idx;
				max = sum;
			}

		}

		System.out.println(maxIdx + " " + max);

	}

}
