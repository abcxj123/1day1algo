import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_11721_열개씩끊어출력하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(cnt == 10) {
				cnt = 0;
				sb.append("\n");
			}
			sb.append(str.charAt(i));
			cnt++;
		}
		
		System.out.println(sb.toString());
		
	}

}
