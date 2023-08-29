import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_12605_단어순서뒤집기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			sb.append("Case #"+i+": ");
			String [] str = br.readLine().split(" ");
			
			for (int j = str.length-1; j >= 0; j--) {
				sb.append(str[j]+" ");
			}
			
			sb.setLength(sb.length()-1);
			sb.append("\n");
			
		}
		
		System.out.println(sb.toString());
		
		
	}

}
