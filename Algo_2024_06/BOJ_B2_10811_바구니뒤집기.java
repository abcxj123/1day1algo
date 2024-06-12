import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_B2_10811_바구니뒤집기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			int size = b - a + 1;

			int[] tmp = new int[size];

			int cnt = 0;
			for (int j = b; j >= a; j--) {
				tmp[cnt++] = arr[j];
			}
			
			cnt = 0;

			for (int j = a; j <= b; j++) {
				arr[j] = tmp[cnt++];
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			sb.append(arr[i] + " ");
		}

		sb.setLength(sb.length() - 1);
		System.out.println(sb.toString());

	}

}
