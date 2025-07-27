import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_10953_AB6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			String [] arr = br.readLine().split(",");
			
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			
			System.out.println(a+b);
		}
		
	}

}
