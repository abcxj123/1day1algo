import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_10205_헤라클레스와히드라 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= K; i++) {
			int h = Integer.parseInt(br.readLine());
			
			String str = br.readLine();
			
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				
				if(c == 'b') {
					h--;
				} else if(c == 'c') {
					h++;
				}
			}
			
			System.out.println("Data Set "+i+":");
			System.out.println(h);
			System.out.println();
			
		}

	}

}
