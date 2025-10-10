import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_5026_박사과정 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String [] arr = br.readLine().split("\\+");
			
			if(arr.length == 1) {
				sb.append("skipped\n");
				continue;
			}
			
			int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
			
			sb.append(sum+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
