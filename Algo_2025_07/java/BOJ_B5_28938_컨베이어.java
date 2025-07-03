import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B5_28938_컨베이어 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		if(sum < 0) System.out.println("Left");
		else if(sum > 0) System.out.println("Right");
		else System.out.println("Stay");
		
	}

}
