import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_4806_줄세기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		String str;
		
		while((str = br.readLine()) != null) {
			cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
