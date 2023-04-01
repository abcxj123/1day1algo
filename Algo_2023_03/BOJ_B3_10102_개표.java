import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_10102_개표 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int V = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < V; i++) {
			char c = str.charAt(i);
			if(c == 'A') {
				a++;
			} else if(c == 'B') {
				b++;
			}
		}
		
		if(a > b) System.out.println('A');
		else if(a < b) System.out.println('B');
		else System.out.println("Tie");
		
	}

}
