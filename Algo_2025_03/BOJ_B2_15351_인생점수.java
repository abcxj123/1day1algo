import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_15351_인생점수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int sum = 0;
			String [] arr = br.readLine().split(" ");
			
			for (int j = 0; j < arr.length; j++) {
				String str = arr[j];
				for (int k = 0; k < str.length(); k++) {
					sum += str.charAt(k) - 'A' + 1;
				}
			}
			
			if(sum == 100) System.out.println("PERFECT LIFE");
			else System.out.println(sum);
		}
		
	}

}
