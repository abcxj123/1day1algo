import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_15917_노솔브방지문제야 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			long a = Integer.parseInt(br.readLine());
		
			if((a & (a-1)) == 0) {
				sb.append("1\n");
			} else {
				sb.append("0\n");
			}
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
