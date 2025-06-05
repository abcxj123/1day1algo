import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_B3_7510_고급수학 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			long [] arr = new long[3];
			
			for (int j = 0; j < 3; j++) {
				arr[j] = Long.parseLong(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			sb.append("Scenario #"+i+":\n");
			if(arr[0]*arr[0] + arr[1]*arr[1] == arr[2]*arr[2]) sb.append("yes\n\n");
			else sb.append("no\n\n");
		}
		
		sb.setLength(sb.length()-2);
		System.out.println(sb.toString());
		
	}

}
