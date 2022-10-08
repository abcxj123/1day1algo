import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_S4_1620_나는야포켓몬마스터 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		String [] arr = new String[N+1];
		
		for (int i = 1; i <= N; i++) {
			String str = br.readLine();
			map.put(str, i);
			arr[i] = str;
		}
		
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			int c = str.charAt(0) - '0';
			
			if(c >= 0 && c <= 10) {
				System.out.println(arr[Integer.parseInt(str)]);
			} else {
				System.out.println(map.get(str));
			}
		}
	}

}
