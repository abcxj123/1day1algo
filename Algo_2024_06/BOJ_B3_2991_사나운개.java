import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_2991_사나운개 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		int [] arr = new int[3];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < 3; i++) {
			int n = arr[i];
			int ans = 0;
			
			int dog1 = n%(A+B);
			int dog2 = n%(C+D);
			
			if(dog1 != 0 && dog1 <= A) ans++;
			if(dog2 != 0 && dog2 <= C) ans++;
			
			sb.append(ans+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
