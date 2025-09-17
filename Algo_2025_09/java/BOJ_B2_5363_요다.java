import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_5363_요다 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			String [] arr = br.readLine().split(" ");
			
			for (int j = 2; j < arr.length; j++) {
				sb.append(arr[j]).append(' ');
			}
			
			sb.append(arr[0]).append(' ');
			sb.append(arr[1]).append('\n');
		}
		
		if(sb.length() > 0) sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
