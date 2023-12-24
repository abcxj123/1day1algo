import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_10886_0notcute1cute {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int zero = 0;
		int one = 0;
		
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				zero++;
			} else if(n == 1) {
				one++;
			}
		}
		
		if(zero > one) {
			System.out.println("Junhee is not cute!");
		} else {
			System.out.println("Junhee is cute!");
		}
		
	}

}
