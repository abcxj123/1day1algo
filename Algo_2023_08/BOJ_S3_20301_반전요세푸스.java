import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S3_20301_반전요세푸스 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		int idx = -1;
		int cnt = 0;
		boolean flag = true;
		
		for (int i = 0; i < N; i++) {
			if(flag) {
				for (int j = 0; j < K; j++) {
					idx++;
					if(idx >= list.size()) {
						idx = 0;
					}
				}
				int n = list.get(idx);
				list.remove(idx);
				sb.append(n+"\n");
				idx--;
			} else {
				for (int j = 0; j < K; j++) {
					idx--;
					if(idx < 0) {
						idx = list.size()-1;
					}
				}
				int n = list.get(idx);
				list.remove(idx);
				sb.append(n+"\n");
			}
			
			cnt++;
			if(cnt >= M) {
				cnt = 0;
				if(!flag) idx--;
				else if(flag) idx++;
				flag = !flag;
			}
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
