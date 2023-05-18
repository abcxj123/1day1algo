import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S4_3036_링 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int first = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N-1; i++) {
			int n = Integer.parseInt(st.nextToken());
			int gcd = getGCD(first, n);
			
			sb.append((first/gcd)+"/"+(n/gcd)).append("\n");
		}
		
		System.out.println(sb.toString());
	}

	private static int getGCD(int a, int b) {
		if(a<b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		
		return a;
	}

}
