import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B1_20362_유니대전퀴즈쇼 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		String S = st.nextToken();
		
		int cnt = 0;
		String ans = "";
		int ansIdx = -1;
		String [] arr = new String[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String chat = st.nextToken();
			
			if(name.equals(S)) {
				ans = chat;
				ansIdx = i;
				break;
			}
			
			arr[i] = chat;
		}
		
		for (int i = 0; i < ansIdx; i++) {
			if(arr[i].equals(ans)) cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
