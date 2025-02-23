import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_27541_Last_Letter {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder(br.readLine());
		
		if(sb.toString().charAt(N-1) == 'G') {
			sb.setLength(sb.length()-1);
		} else {
			sb.append('G');
		}
		
		System.out.println(sb.toString());

	}

}
