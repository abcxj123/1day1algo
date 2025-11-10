import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B1_2869_달팽이는올라가고싶다 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long V = Long.parseLong(st.nextToken());
		
		long diff = A-B;
		long end = V-B;
		long ans = (end/diff);
		
		if(end % diff != 0) ans++;
		
		System.out.println(ans);
		
	}

}
