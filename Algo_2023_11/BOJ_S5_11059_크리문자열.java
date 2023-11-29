import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_11059_크리문자열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int l = s.length();
		int [] sum = new int[l+1];
		
		for (int i = 1; i <= l; i++) {
			int n = s.charAt(i-1) - '0';
			sum[i] = n + sum[i-1];
		}
		
		int ans = 0;
		
		outer:
			// i : 글자수
			for (int i = l/2; i > 0; i--) {
				// j : 몇번 반복할건지
				for (int j = 0; j <= l - i*2; j++) {
					int sum1 = sum[i+j] - sum[j];
					int sum2 = sum[i*2+j] - sum[i+j];
					
					if(sum1 == sum2) {
						ans = i*2;
						break outer;
					}
				}
			}
		
		System.out.println(ans);
		
		
	}

}
