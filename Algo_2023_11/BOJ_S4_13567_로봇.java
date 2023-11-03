import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S4_13567_로봇 {
	static int N, M, d = 1;
	static int [] dr = {-1, 0, 1, 0};
	static int [] dc = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		int r = 0;
		int c = 0;
		
		for (int i = 0; i < N; i++) {
			String [] arr = br.readLine().split(" ");
			int n = Integer.parseInt(arr[1]);
			if(arr[0].equals("MOVE")) {
				int nr = r+dr[d]*n;
				int nc = c+dc[d]*n;
				if(!check(nr, nc)) {
					System.out.println("-1");
					System.exit(0);
				}
				r = nr;
				c = nc;
			} else if(arr[0].equals("TURN")) {
				if(n == 0) {
					d = (d+1) % 4;
				} else if(n == 1) {
					d = (d+3) % 4;
				}
			}
			
		}
		
		System.out.println(c+" "+r);
		
	}

	private static boolean check(int r, int c) {
		return r>=0 && r<M && c>=0 && c<M;
	}

}
