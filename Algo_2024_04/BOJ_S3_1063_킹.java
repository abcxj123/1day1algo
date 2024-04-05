import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S3_1063_킹 {
	static int[] dr = { 0, 0, -1, 1, 1, 1, -1, -1 };
	static int[] dc = { 1, -1, 0, 0, 1, -1, 1, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		String king = st.nextToken();
		String stone = st.nextToken();
		int N = Integer.parseInt(st.nextToken());

		int c = king.charAt(0) - 'A';
		int r = king.charAt(1) - '0' - 1;

		int c2 = stone.charAt(0) - 'A';
		int r2 = stone.charAt(1) - '0' - 1;

		for (int i = 0; i < N; i++) {
			String comm = br.readLine();
			int d = -1;

			switch (comm) {
			case "R":
				d = 0;
				break;
			case "L":
				d = 1;
				break;
			case "B":
				d = 2;
				break;
			case "T":
				d = 3;
				break;
			case "RT":
				d = 4;
				break;
			case "LT":
				d = 5;
				break;
			case "RB":
				d = 6;
				break;
			case "LB":
				d = 7;
				break;

			default:
				break;
			}

			int nr = r + dr[d];
			int nc = c + dc[d];

			if (!check(nr, nc))
				continue;

			if (nr == r2 && nc == c2) {
				int nr2 = r2 + dr[d];
				int nc2 = c2 + dc[d];

				if (!check(nr2, nc2))
					continue;

				r2 = nr2;
				c2 = nc2;
			}

			r = nr;
			c = nc;

		}
		
		StringBuilder sb = new StringBuilder();
		
		char ans1 = (char) (c + 'A');
		int ans2 = r + 1;
		
		char ans3 = (char) (c2 + 'A');
		int ans4 = r2 + 1;
		
		sb.append(ans1).append(ans2).append('\n');
		sb.append(ans3).append(ans4);
		
		System.out.println(sb.toString());

	}

	private static boolean check(int r, int c) {
		return r >= 0 && r < 8 && c >= 0 && c < 8;
	}

}
