import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_S5_2993_세부분 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int N = str.length();
		List<String> list = new ArrayList<>();
		
		for (int i = 1; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				StringBuilder sb = new StringBuilder();
				StringBuilder rev = new StringBuilder();
				String str1 = str.substring(0, i);
				String str2 = str.substring(i, j);
				String str3 = str.substring(j, N);
				
				rev.append(str1);
				sb.append(rev.reverse().toString());
				rev.setLength(0);
				
				rev.append(str2);
				sb.append(rev.reverse().toString());
				rev.setLength(0);
				
				rev.append(str3);
				sb.append(rev.reverse().toString());
				
				list.add(sb.toString());
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
		
	}

}
