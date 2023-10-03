import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B4_5575_타임카드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int h1 = Integer.parseInt(st.nextToken());
			int m1 = Integer.parseInt(st.nextToken());
			int s1 = Integer.parseInt(st.nextToken());
			int t1 = 3600 * h1 + 60 * m1 + s1;
			
			int h2 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());
			int s2 = Integer.parseInt(st.nextToken());
			int t2 = 3600 * h2 + 60 * m2 + s2;
			
			int t3 = t2 - t1;
			
			int ans1 = t3 / 3600;
			t3 -= ans1 * 3600;
			
			int ans2 = t3 / 60;
			int ans3 = t3 % 60;
			
			System.out.println(ans1+" "+ans2+" "+ans3);
			
		}
		
	}

}
