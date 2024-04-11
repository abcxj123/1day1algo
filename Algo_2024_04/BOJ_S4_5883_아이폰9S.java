import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BOJ_S4_5883_아이폰9S {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			set.add(n);
			list.add(n);
		}
		
		List<Integer> list2 = new ArrayList<Integer>(set);
		set.clear();
		
		int max = -1;
		for(int idx : list2) {
			int past = -1;
			int cnt = 1;
			int maxNow = -1;
			for (int i = 0; i < N; i++) {
				int n = list.get(i);
				
				if(n == idx) continue;
				
				if(past == n) cnt++;
				else {
					maxNow = Math.max(maxNow, cnt);
					cnt = 1;
				}
				past = n;
			}
			maxNow = Math.max(maxNow, cnt);
			
			max = Math.max(max, maxNow);
			
		}
		
		System.out.println(max);
		
	}

}
