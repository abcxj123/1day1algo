import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S5_10709_기상캐스터 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int [][] ans = new int[R][C];
		
		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			boolean cloud = false;
			int cnt = 0;
			for (int j = 0; j < C; j++) {
				char c = str.charAt(j);
				if(c == 'c') {
					cloud = true;
					cnt = 0;
				}
				
				if(cloud) {
					ans[i][j] = cnt++;
				} else {
					ans[i][j] = -1;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				sb.append(ans[i][j]+" ");
			}
			sb.setLength(sb.length()-1);
			sb.append('\n');
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
