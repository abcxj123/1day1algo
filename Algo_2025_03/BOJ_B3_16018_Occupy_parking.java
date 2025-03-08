import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_16018_Occupy_parking {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String s1 = br.readLine();
		String s2 = br.readLine();
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
			if(c1 == 'C' && c2 == 'C') ans++;
		}
		
		System.out.println(ans);
		
	}

}
