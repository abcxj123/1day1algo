import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_11772_POT {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			int num = Integer.parseInt(str.substring(0, str.length()-1));
			int p = Integer.parseInt(str.substring(str.length()-1, str.length()));
			
			sum += Math.pow(num, p);
		}
		
		System.out.println(sum);

	}

}
