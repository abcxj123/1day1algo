import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_14909_양수개수세기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			
			if(n > 0) cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
