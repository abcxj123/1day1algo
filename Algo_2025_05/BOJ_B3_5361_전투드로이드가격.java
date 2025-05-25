import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_5361_전투드로이드가격 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			double sum = 0;
			
			sum += Integer.parseInt(st.nextToken()) * 350.34;
			sum += Integer.parseInt(st.nextToken()) * 230.90;
			sum += Integer.parseInt(st.nextToken()) * 190.55;
			sum += Integer.parseInt(st.nextToken()) * 125.30;
			sum += Integer.parseInt(st.nextToken()) * 180.90;
			
			System.out.println(String.format("$%.2f", sum));	
		}
	}

}
