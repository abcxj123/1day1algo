import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S5_12760_최후의승자는누구 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Integer [][] arr = new Integer[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < N; i++) {
			Arrays.sort(arr[i], Collections.reverseOrder());
		}
		
		int [] cnt = new int[N];
		
		for (int i = 0; i < M; i++) {
			List<Integer> list = new ArrayList<>();
			int max = -1;
			
			for (int j = 0; j < N; j++) {
				if(arr[j][i] > max) {
					list.clear();
					list.add(j+1);
					max = arr[j][i];
				} else if(arr[j][i] == max) {
					list.add(j+1);
				}
			}
			
			for(int n : list) {
				cnt[n-1]++;
			}
			
		}
		
		List<Integer> winner = new ArrayList<>();
		
		int max = -1;
		for (int i = 0; i < N; i++) {
			if(cnt[i] > max) {
				winner.clear();
				winner.add(i+1);
				max = cnt[i];
			} else if(cnt[i] == max) {
				winner.add(i+1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int n : winner) {
			sb.append(n+" ");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
		
	}

}
