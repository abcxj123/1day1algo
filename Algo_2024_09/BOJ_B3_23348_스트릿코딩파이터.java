import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_23348_스트릿코딩파이터 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int N = Integer.parseInt(br.readLine());
		int max = 0;
		
		for (int i = 0; i < N; i++) {
			int one = 0;
			int two = 0;
			int three = 0;
			
			for (int j = 0; j < 3; j++) {
				st = new StringTokenizer(br.readLine());
				one += Integer.parseInt(st.nextToken());
				two += Integer.parseInt(st.nextToken());
				three += Integer.parseInt(st.nextToken());
			}
			
			int sum = a*one + b*two + c*three;
			max = Math.max(max, sum);
			
		}
		
		System.out.println(max);

	}

}
