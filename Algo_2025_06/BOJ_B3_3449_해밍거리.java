import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_3449_해밍거리 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			String a = br.readLine();
			String b = br.readLine();
			int cnt = 0;
			
			for (int i = 0; i < a.length(); i++) {
				int aa = a.charAt(i);
				int bb = b.charAt(i);
				
				if(aa != bb) cnt++;
			}
			
			sb.append("Hamming distance is "+cnt+".\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
