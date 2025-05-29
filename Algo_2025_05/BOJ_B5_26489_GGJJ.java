import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B5_26489_GGJJ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int ans = 0;
		String str;
		
		while((str = br.readLine()) != null) {
			ans++;
		}
		
		System.out.println(ans);

	}

}
