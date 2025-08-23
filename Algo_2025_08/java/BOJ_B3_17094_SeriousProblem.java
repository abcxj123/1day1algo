import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_17094_SeriousProblem {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int two = 0;
		int e = 0;
		
		String s = br.readLine();
		
		for (int i = 0; i < N; i++) {
			char c = s.charAt(i);
			
			if(c == '2') two++;
			else e++;
		}
		
		if(two > e) System.out.println(2);
		else if(two < e) System.out.println('e');
		else System.out.println("yee");

	}

}
