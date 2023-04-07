import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S5_27111_출입기록 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		boolean [] check = new boolean[200001];
		int max = -1;
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int id = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			max = Math.max(max, id);
			
			if(n == 1) {
				if(check[id]) {
					cnt++;
				} else {
					check[id] = true;
				}
				
			} else if(n == 0) {
				if(check[id]) {
					check[id] = false;
				} else {
					cnt++;
				}
			}
		}
		
		for (int i = 1; i <= max; i++) {
			if(check[i]) cnt++;
		}
		
		System.out.println(cnt);
	}

}
