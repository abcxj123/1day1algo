import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B4_25991_LotsofLiquid {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double sum = 0.0;
		
		for (int i = 0; i < N; i++) {
			double n = Double.parseDouble(st.nextToken());
			sum += (double) n*n*n;
		}
		
		System.out.println(Math.cbrt(sum));
		
	}

}
