import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_10179_쿠폰 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			double cost = Double.parseDouble(br.readLine());
			cost *= 0.8;
			
			System.out.printf("$%.2f\n", cost);
		}
		
	}

}
