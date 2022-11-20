import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_S4_20551_Sort마스터배지훈의후계자 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		Map<Integer, Integer> map = new HashMap<>();
		int [] arr = new int[N];
		
		int M = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < N; i++) {
			int n = arr[i];
			if(map.get(n) == null) {
				map.put(n, i);
			}
		}
		
		for (int i = 0; i < M; i++) {
			int n = Integer.parseInt(br.readLine());
			if(map.get(n) == null) {
				sb.append("-1").append("\n");
			} else {
				sb.append(map.get(n)).append("\n");
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
