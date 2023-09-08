import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B4_13866_팀나누기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = 0;
		int b = 0;
		
		a += Integer.parseInt(st.nextToken());
		b += Integer.parseInt(st.nextToken());
		b += Integer.parseInt(st.nextToken());
		a += Integer.parseInt(st.nextToken());
		
		System.out.println(Math.abs(a-b));
		
		
	}

}
