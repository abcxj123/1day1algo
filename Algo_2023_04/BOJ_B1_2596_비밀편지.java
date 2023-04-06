import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_2596_비밀편지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String [] arr = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};
		
		int N = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		for (int i = 0; i < N; i++) {
			boolean check = false;
			for (int j = 0; j < 8; j++) {
				String num = arr[j];
				int cnt = 0;
				
				for (int k = 0; k < 6; k++) {
					char c1 = num.charAt(k);
					char c2 = str.charAt(i*6+k);
					if(c1 != c2) {
						cnt++;
					}
					
					if(cnt >= 2) {
						break;
					}
				}
				
				if(cnt <= 1) {
					check = true;
					sb.append((char)(j+'A'));
					break;
				}
				
			}
			
			if(!check) {
				System.out.println(i+1);
				System.exit(0);
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
