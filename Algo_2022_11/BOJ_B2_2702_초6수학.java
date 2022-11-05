import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B2_2702_초6수학 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int tmp1 = a;
			int tmp2 = b;
			
			while(tmp1 != tmp2) {
				if(tmp1 < tmp2) tmp1 += a;
				else if(tmp1 > tmp2) tmp2 += b;
			}
			
			int min = a * b / tmp1;
			System.out.println(tmp1+" "+min);
			
		}
	}

}
