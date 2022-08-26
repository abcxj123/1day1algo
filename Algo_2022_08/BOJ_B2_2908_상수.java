import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B2_2908_상수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken();
		String newA = new StringBuffer(A).reverse().toString();
		String B = st.nextToken();
		String newB = new StringBuffer(B).reverse().toString();
		
		int n1 = Integer.parseInt(newA);
		int n2 = Integer.parseInt(newB);
		
		if(n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}

	}

}
