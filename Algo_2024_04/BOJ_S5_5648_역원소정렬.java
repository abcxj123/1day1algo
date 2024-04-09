import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S5_5648_역원소정렬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		List<Long> list = new ArrayList<Long>();
		
		while(cnt < N) {
			while(st.hasMoreTokens()) {
				cnt++;
				StringBuilder sb2 = new StringBuilder();
				sb2.append(st.nextToken());
				list.add(Long.parseLong(sb2.reverse().toString()));
			}
			
			if(cnt < N) {
				st = new StringTokenizer(br.readLine());
			}
		}
		
		Collections.sort(list);
		
		for (Long n : list) {
			sb.append(n).append('\n');
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
