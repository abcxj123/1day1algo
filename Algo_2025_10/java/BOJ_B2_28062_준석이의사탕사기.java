import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_B2_28062_준석이의사탕사기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int ans = 0;
		List<Integer> list = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			if(n % 2 == 0) ans += n;
			else list.add(n);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		int size = list.size();
		if(size % 2 != 0) size--;
		
		for (int i = 0; i < size; i++) {
			ans += list.get(i);
		}
		
		System.out.println(ans);
		
	}

}
