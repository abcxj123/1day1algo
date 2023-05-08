import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B1_14659_한조서열정리하고옴ㅋㅋ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int max = 0;
		int cnt = 0;
		int maxNum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			if(n > maxNum) {
				maxNum = n;
				cnt = 0;
			}
			
			max = Math.max(cnt, max);
			
			cnt++;
		}
		
		System.out.println(max);
	}

}
