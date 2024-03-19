import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_28238_정보선생님의야망 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int [][] arr = new int[N][5];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int ans = 0;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 5; i++) {
			for (int j = i+1; j < 5; j++) {
				
				int cnt = 0;
				for (int k = 0; k < N; k++) {
					if(arr[k][i] == 1 && arr[k][j] == 1) {
						cnt++;
					}
				}
				if(cnt > ans) {
					ans = cnt;
					sb.setLength(0);
					for (int k = 0; k < 5; k++) {
						if(k == i || k == j) {
							sb.append(1+" ");
						} else {
							sb.append(0+" ");
						}
					}
					sb.setLength(sb.length()-1);
				}
			}
		}
		
		if(ans == 0) {
			sb.append("1 1 0 0 0");
		}
		
		System.out.println(ans);
		System.out.println(sb.toString());
		
	}

}
