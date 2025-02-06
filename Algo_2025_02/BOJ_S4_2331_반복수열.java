import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_S4_2331_반복수열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		
		int A = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		list.add(A);
		set.add(A);
		int ans = 0;
		
		outer:
			while(true) {
				int num = 0;
				
				while(A > 0) {
					int n = A % 10;
					num += Math.pow(n, P);
					A /= 10;
				}
				
				if(set.contains(num)) {
					for (int i = 0; i < list.size(); i++) {
						if(list.get(i) == num) {
							ans = i;
							break outer;
						}
					}
				}
				
				list.add(num);
				set.add(num);
				A = num;
			}
		
		System.out.println(ans);
		
	}

}
