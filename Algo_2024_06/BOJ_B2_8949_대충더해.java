import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_B2_8949_대충더해 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		int alen = A.length();
		
		String B = st.nextToken();
		int blen = B.length();
		
		int maxLen = Math.max(alen, blen);
		int [] sum = new int[maxLen];
		
		int idx = 0;
		for (int i = alen-1; i >= 0; i--) {
			sum[idx++] += A.charAt(i) - '0';
		}
		
		idx = 0;
		for (int i = blen-1; i >= 0; i--) {
			sum[idx++] += B.charAt(i) - '0';
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = maxLen-1; i >= 0; i--) {
			sb.append(sum[i]);
		}
		
		System.out.println(sb.toString());

	}

}
