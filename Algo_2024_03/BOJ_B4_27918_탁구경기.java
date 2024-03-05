import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_27918_탁구경기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int D = 0;
		int P = 0;
		
		for (int i = 0; i < N; i++) {
			char c = br.readLine().charAt(0);
			
			if(sb.length() > 0) continue;
			
			if(c == 'D') {
				D++;
			} else {
				P++;
			}
			
			if(D >= P+2) {
				sb.append(D+":"+P);
			} else if(D+2 <= P) {
				sb.append(D+":"+P);
			}
			
		}
		
		if(sb.length() == 0) {
			System.out.println(D+":"+P);
		} else {
			System.out.println(sb.toString());
		}
		
	}

}
