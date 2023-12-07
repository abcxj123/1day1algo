import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_S5_29615_알파빌과베타빌 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<Integer> set = new HashSet<>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int [] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		int cnt = M;
		
		for (int i = 0; i < M; i++) {
			if(set.contains(arr[i])) {
				cnt--;
			}
		}
		
		System.out.println(cnt);
		
	}

}
