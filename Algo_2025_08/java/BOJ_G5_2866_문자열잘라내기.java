import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_G5_2866_문자열잘라내기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		char [][] arr = new char[R][C];
		
		for (int i = 0; i < R; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < C; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < R; j++) {
				sb.append(arr[j][i]);
			}
			
			list.add(sb.toString());
		}
		
		int left = 0;
		int right = R-1;
		int mid;
		int ans = 0;
		
		while(left <= right) {
			mid = (left + right) / 2;
			
			boolean check = true;
			Set<String> set = new HashSet<>();
			
			for (String s : list) {
				String cut = s.substring(mid);
				
				if(set.contains(cut)) {
					check = false;
					break;
				}
				
				set.add(cut);
				
			}
			
			if(check) {
				ans = Math.max(ans, mid);
				left = mid+1;
			} else {
				right = mid-1;
			}
		}
		
		System.out.println(ans);
		
		
		
	}

}
