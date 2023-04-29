import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_11719_그대로출력하기2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while((str = br.readLine()) != null) {
			sb.append(str).append("\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
	}

}
