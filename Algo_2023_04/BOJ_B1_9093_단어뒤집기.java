import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_9093_단어뒤집기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String [] str = br.readLine().split(" ");
			
			for (int j = 0; j < str.length; j++) {
				StringBuilder tmp = new StringBuilder(str[j]);
				sb.append(tmp.reverse().toString()+" ");
			}
			
			sb.setLength(sb.length()-1);
			sb.append("\n");
			
		}
		
		sb.setLength(sb.length()-1);
		
		System.out.println(sb.toString());
		
	}

}
