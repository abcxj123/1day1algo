import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_11098_첼시를도와줘 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			
			int max = 0;
			String maxName = null;
			
			for (int i = 0; i < N; i++) {
				String [] arr = br.readLine().split(" ");
				int money = Integer.parseInt(arr[0]);
				if(money > max) {
					max = money;
					maxName = arr[1];
				}
			}
			
			System.out.println(maxName);
			
		}
	}

}
